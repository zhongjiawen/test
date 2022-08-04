package com.example.demo.Service;

import com.example.demo.enity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class testMapperIservice {

    @Autowired
    com.example.demo.Mapper.testMapper testMapper;

    public List<String> findAll() {
        return testMapper.findAll();
    }
    public List<User> findAll2() {
        return testMapper.findAll2();
    }
}
