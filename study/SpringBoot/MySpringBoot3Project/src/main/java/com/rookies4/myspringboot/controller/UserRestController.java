package com.rookies4.myspringboot.controller;

import com.rookies4.myspringboot.entity.UserEntity;
import com.rookies4.myspringboot.exception.BusinessException;
import com.rookies4.myspringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    //등록
    @PostMapping
    public UserEntity create(@RequestBody UserEntity user) {
        return userRepository.save(user);
    }

    //전체목록 조회
    @GetMapping
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    //개별 조회 : ID로
//    @GetMapping("/{id}")
//    public UserEntity getUser(@PathVariable Long id) {
//        Optional<UserEntity> optionalUser = userRepository.findById(id);
//        //orElseThrow(Supplier) Supplier의 추상메서드 T get()
//        UserEntity existUser = optionalUser
//                .orElseThrow(() -> new BusinessException("User Not Found", HttpStatus.NOT_FOUND));
//        return existUser;
//    }

}
