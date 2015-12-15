package com.ganesh.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class SampleController {

    @Value('${greeting}')
    private String greeting


    @RequestMapping("/hi")
    String greeting() {
        return greeting
    }
}
