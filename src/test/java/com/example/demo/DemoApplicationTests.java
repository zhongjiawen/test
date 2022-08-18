package com.example.demo;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.MapStruct.OrderMapper;
import com.example.demo.Mapper.UserMapper;
import com.example.demo.Model.MyPage;
import com.example.demo.enity.OrderPo;
import com.example.demo.enity.OrderVo;
import com.example.demo.enity.Tuser;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
//
//分支修改
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Resource
	private UserMapper mapper;

	@Test
	void lambdaPagination() {
	};



}
