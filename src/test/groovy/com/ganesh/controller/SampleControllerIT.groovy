package com.ganesh.controller

import com.ganesh.Application
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.boot.test.TestRestTemplate
import org.springframework.http.ResponseEntity
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.web.client.RestTemplate

import static org.hamcrest.CoreMatchers.equalTo
import static org.springframework.test.util.MatcherAssertionErrors.assertThat

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest(value = "server.port=0")
class SampleControllerIT {

    @Value('${local.server.port}')
    private int port

    private URL base
    private RestTemplate template

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/")
        template = new TestRestTemplate()
    }

    @Test
    public void greeting() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString() + "hi", String.class)
        assertThat(response.getBody(), equalTo("Hello localhost"))
    }
}
