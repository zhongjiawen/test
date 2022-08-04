package com.example.demo.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Mapper.UserMapper;
import com.example.demo.enity.Tuser;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, Tuser> implements IUserService {

}