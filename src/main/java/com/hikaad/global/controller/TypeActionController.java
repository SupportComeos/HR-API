package com.hikaad.global.controller;

import com.hikaad.global.model.TypeAction;
import com.hikaad.global.repository.TypesActionRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class TypeActionController {

    private TypesActionRepository typesActionRepository;

    @Autowired
    public TypeActionController(TypesActionRepository typesActionRepository) {
        this.typesActionRepository = typesActionRepository;
    }

    @GetMapping("/TypeAction")
    List<TypeAction> getAll() {
        try {
            return typesActionRepository.findAll();
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }
}
