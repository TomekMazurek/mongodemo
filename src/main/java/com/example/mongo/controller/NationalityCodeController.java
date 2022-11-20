package com.example.mongo.controller;

import com.example.mongo.model.NationalityCode;
import com.example.mongo.repository.NationalityCodeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nationality")
@AllArgsConstructor
public class NationalityCodeController {

    private final NationalityCodeRepository nationalityCodeRepository;

    @GetMapping
    List<NationalityCode> getAll() {
        return nationalityCodeRepository.findAll();
    }

    @GetMapping("/{nationality}")
    NationalityCode findByNationality(@RequestParam String nationality) {
        return nationalityCodeRepository.findNationalityCodeByNationality(nationality);
    }

    @PostMapping
    NationalityCode addNationality(@RequestBody NationalityCode nationalityCode) {
        return nationalityCodeRepository.save(nationalityCode);
    }

}
