package com.example.mongo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("users")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {

    @Id
    private String id;
    private String name;
    private Adress address;
    private String nationality;

    private LocalDateTime created;

    public User(String name, Adress address, LocalDateTime created) {
        this.name = name;
        this.address = address;
        this.created = created;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", addressId='" + address + '\'' +
                '}';
    }
}
