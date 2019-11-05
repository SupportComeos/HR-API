package com.hikaad.global.controller;

import com.hikaad.global.model.Entreprises;
import com.hikaad.global.repository.EntreprisesRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class EntreprisesController {

    private EntreprisesRepository entreprisesRepository;

    @Autowired
    public  EntreprisesController(EntreprisesRepository entreprisesRepository) {
        this.entreprisesRepository = entreprisesRepository;
    }

    @GetMapping("/Entreprises")
    public List<Entreprises> getAll() {
        try {
            return entreprisesRepository.findAll();
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/Entreprises/{search}")
    public List<Entreprises> getByFilter(@PathVariable String search) {
        try {
            Long[]      filter = new Long[search.split(",").length];
            String[]    result = search.split(",");

            for (int i = 0; i < result.length; i++)
                filter[i] = Long.parseLong(result[i]);

            return entreprisesRepository.findByFilter(filter);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }
}