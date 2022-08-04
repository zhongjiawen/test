package com.example.demo.MapStruct;

import com.example.demo.enity.OrderPo;
import com.example.demo.enity.OrderVo;
import org.mapstruct.Mapper;

@Mapper
public interface OrderMapper {
    OrderVo entity2queryParam(OrderPo orderpo);

}
