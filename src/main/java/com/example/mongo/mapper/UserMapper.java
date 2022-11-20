package com.example.mongo.mapper;

import com.example.mongo.model.User;
import com.example.mongo.model.UserDto;
import com.mongodb.annotations.Beta;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.jni.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class UserMapper {

    public UserDto usertoDto(User user, String nationality) {
        return UserDto.builder()
                .name(user.getName())
                .address(user.getAddress().toString())
                .nationality(nationality)
                .build();
    }
}
