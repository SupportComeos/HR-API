package com.hikaad.entretiensuivi.controller;

import com.hikaad.entretiensuivi.dto.TypeEntretienDTO;
import com.hikaad.entretiensuivi.model.TypeEntretien;
import com.hikaad.entretiensuivi.repository.TypeEntretienRepository;
import com.hikaad.utils.HikaadLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class TypeEntretienController {

    private TypeEntretienRepository typeEntretienRepository;

    @Autowired
    public TypeEntretienController(TypeEntretienRepository typeEntretienRepository) {
        this.typeEntretienRepository = typeEntretienRepository;
    }

    @GetMapping("/EntretienSuivi/TypeEntretien")
    public List<TypeEntretien> getAll() {
        try {
            HikaadLogger.info("/EntretienSuivi/TypeEntretien GET Call");
            return typeEntretienRepository.findAll();
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @GetMapping("/EntretienSuivi/TypeEntretien/Search/{text}")
    public List<TypeEntretien> searchAll(@PathVariable String text) {
        try {
            return typeEntretienRepository.searchAll(text);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return Collections.emptyList();
        }
    }

    @PostMapping("/EntretienSuivi/TypeEntretien")
    public TypeEntretien addElement(@RequestBody TypeEntretienDTO typeEntretienDTO) {
        try {
            TypeEntretien typeEntretien = new TypeEntretien();
            typeEntretien.setName(typeEntretienDTO.getName());
            return typeEntretienRepository.saveAndFlush(typeEntretien);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new TypeEntretien();
        }
    }

    @PutMapping("/EntretienSuivi/TypeEntretien")
    public TypeEntretien updateElement(@RequestBody TypeEntretienDTO typeEntretienDTO) {
        try {
            TypeEntretien typeEntretien = typeEntretienRepository.getOne(typeEntretienDTO.getId());
            typeEntretien.setName(typeEntretienDTO.getName());
            return typeEntretienRepository.saveAndFlush(typeEntretien);
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return new TypeEntretien();
        }
    }

    @DeleteMapping("/EntretienSuivi/TypeEntretien/{id}")
    public boolean deleteElement(@PathVariable Long id) {
        try {
            typeEntretienRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            HikaadLogger.error(e.toString());
            return false;
        }
    }
}
