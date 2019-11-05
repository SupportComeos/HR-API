package com.hikaad.global.controller;

import com.hikaad.global.model.Departements;
import com.hikaad.global.repository.DepartementsRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class DepartementsController {

    private DepartementsRepository departementsRepository;

    @Autowired
    public DepartementsController(DepartementsRepository departementsRepository) {
        this.departementsRepository = departementsRepository;
    }

    @GetMapping("/Departements")
    public List<Departements> getAll() {
        try {
            return departementsRepository.findAll();
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }
}