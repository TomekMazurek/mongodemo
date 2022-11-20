package com.example.mongo.service;

import com.example.mongo.mapper.UserMapper;
import com.example.mongo.model.User;
import com.example.mongo.model.UserDto;
import com.example.mongo.repository.NationalityCodeRepository;
import com.example.mongo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final NationalityCodeRepository nationalityCodeRepository;
    private final UserMapper userMapper;

    public User addUser(User user) {
        user.setCreated(LocalDateTime.now());
        return userRepository.insert(user);
    }

    public User findUserByName(String name) {
        return userRepository.findUserByName(name);
    }

    public List<UserDto> getUsers() {
        List<User> users = userRepository.findAll();
        List<UserDto> dtos = new ArrayList<>();
        users.forEach(user -> {
            dtos.add(
                    userMapper.usertoDto(user,
                            nationalityCodeRepository.findNationalityCodeByNationality(user.getNationality()).getCode()));
        });
        return dtos;
    }
}
