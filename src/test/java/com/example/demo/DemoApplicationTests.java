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
//分支修改第一次
//分支修改第=次
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Resource
	private UserMapper mapper;

	@Test
	void lambdaPagination() {
		Page<Tuser> page = new Page<>(1, 3);
//		Page<Tuser> result = mapper.selectPage(page,
//				Wrappers.<Tuser>lambdaQuery()
//						.ge(Tuser::getId, 1)
//						.orderByAsc(Tuser::getName));
//		MyPage<Tuser> result = (MyPage<Tuser>) mapper.selectPage(page,
//				null);
		MyPage<Tuser> result = new MyPage<Tuser> (1, 3);
		MyPage<Tuser> myPage =  mapper.mySelectPage(result);
		List<Tuser> tttt =myPage.getRecords();
		for(Tuser item :tttt){
			System.out.print(item.getId());
			System.out.println(item.getIdName());
		}

		System.out.println("钟嘉文");

//		System.out.println(result.getRecords());
//		assertThat(result.getTotal()).isGreaterThan(3);
//		assertThat(result.getRecords().size()).isEqualTo(3);
//		mapper.selectPage(page,)
	}

	@Test
	void lambdaPagination2() {
		Page<Tuser> page = new Page<>(1, 3);
	//	MyPage<Tuser> result = new MyPage<Tuser> (1, 3);
		Page<Tuser> myPage =  mapper.mySelectPage2(page);
		List<Tuser> tttt =myPage.getRecords();
		for(Tuser item :tttt){
			System.out.print(item.getId());
			System.out.println(item.getIdName());
		}

		System.out.println("钟嘉文");

	}
	@Test
	public void entity2queryParam() {
		OrderPo order = new OrderPo();
		order.setId(12345L);
		order.setOrderSn("orderSn");
		order.setOrderType(0);
		order.setReceiverKeyword("keyword");
		order.setSourceType(1);
		order.setStatus(2);

		OrderMapper mapper = Mappers.getMapper(OrderMapper.class);
		OrderVo orderQueryParam = mapper.entity2queryParam(order);

		assertEquals(orderQueryParam.getOrderSn(), order.getOrderSn());
		assertEquals(orderQueryParam.getOrderType(), order.getOrderType());
		assertEquals(orderQueryParam.getReceiverKeyword(), order.getReceiverKeyword());
		assertEquals(orderQueryParam.getSourceType(), order.getSourceType());
		assertEquals(orderQueryParam.getStatus(), order.getStatus());



}
