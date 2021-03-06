package com.hikaad.global.controller;

import com.hikaad.global.model.Services;
import com.hikaad.global.repository.ServiceRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ServicesController {

    private ServiceRepository serviceRepository;

    @Autowired
    public ServicesController(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @GetMapping("/Services")
    public List<Services> getAll() {
        try {
            return serviceRepository.findAll();
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }
}
