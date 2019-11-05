package com.hikaad;

import com.hikaad.utils.HikaadLogger;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    private static final String MODULE = "VersionController - ";

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.name}")
    private String appName;

    @GetMapping("/Version")
    public String getVersion() {
        try {
            return appName + " " + appVersion;
        } catch (Exception e) {
            HikaadLogger.error(MODULE + e);
            return StringUtils.EMPTY;
        }
    }
}
