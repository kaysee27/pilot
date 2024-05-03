package com.kaysee.pilot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PilotController {

    @GetMapping("/health-check")
    public Boolean getHealthCheck() {
        return true;
    }

}
