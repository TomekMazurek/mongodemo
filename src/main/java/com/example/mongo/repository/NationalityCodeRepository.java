package com.example.mongo.repository;

import com.example.mongo.model.NationalityCode;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NationalityCodeRepository extends MongoRepository<NationalityCode, String> {

    NationalityCode findNationalityCodeByNationality(String nationality);
}
