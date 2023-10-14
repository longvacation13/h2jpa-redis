package com.example.demo.longvacation.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USR") // 여기서 올바른 테이블 이름을 지정해야 합니다.
@RequiredArgsConstructor
@Getter
@Setter
public class Usr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;



}