package com.example.demo.Mapper;

import com.example.demo.enity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface testMapper {
    @Select("SELECT * FROM test1")
    @Results({
            @Result(column="role_id", property="roleId",jdbcType=JdbcType.VARCHAR,id=true),
            @Result(column="role_name", property="roleName",jdbcType= JdbcType.VARCHAR),
            @Result(column="creat_time", property="creatTime",jdbcType=JdbcType.TIMESTAMP)
    })
    public List<User> findAll2();

    @Select("SELECT * FROM test1")
    @Results({

            @Result(column="role_name", property="roleName")
    })
    public List<String> findAll();


}
