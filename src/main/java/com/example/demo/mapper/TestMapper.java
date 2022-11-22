package com.example.demo.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
    List selectLogin(String userName, String passWord);
}
