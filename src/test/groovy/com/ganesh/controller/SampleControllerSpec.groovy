package com.ganesh.controller

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by a6001112 on 12/15/15.
 */
class SampleControllerSpec extends Specification {

    SampleController sampleController

    def setup() {
        sampleController = new SampleController(greeting: 'hi')
    }

    @Unroll
    def "greeting test"() {

        when:
        String greeting = sampleController.greeting()

        then:
        greeting == 'hi'

    }


}
