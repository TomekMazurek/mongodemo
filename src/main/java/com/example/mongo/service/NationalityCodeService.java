package com.example.mongo.service;

import com.example.mongo.model.NationalityCode;
import com.example.mongo.repository.NationalityCodeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NationalityCodeService {

    private final NationalityCodeRepository nationalityCodeRepository;

    public List<NationalityCode> getAllNationalities() {
        return nationalityCodeRepository.findAll();
    }

    public NationalityCode addNationalityCode(NationalityCode nationalityCode) {
        return nationalityCodeRepository.save(nationalityCode);
    }

    public NationalityCode findByNationality(String nationality) {
        return nationalityCodeRepository.findNationalityCodeByNationality(nationality);
    }
}
