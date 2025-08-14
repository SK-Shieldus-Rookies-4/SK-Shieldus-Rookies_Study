package com.rookies4.myspringboot.controller;

import com.rookies4.myspringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor // final이 붙은 변수의 생성자를 초기화해줌
public class UserRestController {
    private final UserRepository userRepository; // final 붙이면 선언과 동시에 초기화 필요

//    //Constructor Injection
//    public UserRestController(UserRepository userRepository) {
//        System.out.println("생성자 인젝션 " + userRepository.getClass().getName());
//        this.userRepository = userRepository;
//    }


}
