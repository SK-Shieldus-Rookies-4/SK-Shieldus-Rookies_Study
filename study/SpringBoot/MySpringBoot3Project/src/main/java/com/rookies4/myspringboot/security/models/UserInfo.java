package com.rookies4.myspringboot.security.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter  //엔티티에는 @Data 안 만드는 것이 좋음
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String roles;
}