package com.example.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("codes")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class NationalityCode {

    @Id
    private String id;
    private String nationality;
    private String code;
}
