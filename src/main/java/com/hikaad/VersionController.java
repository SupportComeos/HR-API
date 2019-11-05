package com.hikaad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.name}")
    private String appName;

    @GetMapping("/Version")
    public String getVersion() {
        return appName + " " + appVersion;
    }
}
