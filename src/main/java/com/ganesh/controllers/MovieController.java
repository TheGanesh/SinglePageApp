package com.ganesh.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ganesh on 12/14/15.
 */
@RestController
public class MovieController {

    @Value("${greeting}")
    private String greeting;

    @RequestMapping("/")
    String greeting() {
        return greeting;
    }
}
