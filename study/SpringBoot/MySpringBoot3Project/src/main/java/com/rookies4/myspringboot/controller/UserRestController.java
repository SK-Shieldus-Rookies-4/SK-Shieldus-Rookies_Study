package com.rookies4.myspringboot.controller;

import com.rookies4.myspringboot.entity.UserEntity;
import com.rookies4.myspringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor // final이 붙은 변수의 생성자를 초기화해줌
@RequestMapping("/api/users")
public class UserRestController {
    private final UserRepository userRepository; // final 붙이면 선언과 동시에 초기화 필요

//    //Constructor Injection
//    public UserRestController(UserRepository userRepository) {
//        System.out.println("생성자 인젝션 " + userRepository.getClass().getName());
//        this.userRepository = userRepository;
//    }

    @PostMapping //등록
    public UserEntity create(@RequestBody UserEntity user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

}
