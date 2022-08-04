package com.example.demo.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.Model.MyPage;
import com.example.demo.enity.Tuser;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper extends BaseMapper<Tuser> {

    /**
     * 3.x 的 page 可以进行取值,多个入参记得加上注解
     * 自定义 page 类必须放在入参第一位
     * 返回值可以用 IPage<T> 接收 也可以使用入参的 MyPage<T> 接收
     * <li> 3.1.0 之前的版本使用注解会报错,写在 xml 里就没事 </li>
     * <li> 3.1.0 开始支持注解,但是返回值只支持 IPage ,不支持 IPage 的子类</li>
     *
     * @param myPage 自定义 page
     * @return 分页数据
     */
//      #{pg.selectInt} @Param("pg")
    @Select("SELECT * FROM tuser  ")
    MyPage<Tuser> mySelectPage( MyPage<Tuser> myPage);
//    @Select("SELECT * FROM tuser ORDER ")
////    MyPage<Tuser> mySelectPage();
    @Select("SELECT * FROM tuser ")
    Page<Tuser> mySelectPage2( Page<Tuser> myPage);

//    @SuppressWarnings("checkstyle:OperatorWrap")
//    @ResultMap("userChildrenMap")
//    @Select("<script>select u.id,u.name,u.email,u.age,c.id as \"c_id\",c.name as \"c_name\",c.user_id as \"c_user_id\" " +
//            "from user u " +
//            "left join children c on c.user_id = u.id " +
//            "<where>" +
//            "<if test=\"selectInt != null\"> " +
//            "and u.age = #{selectInt} " +
//            "</if> " +
//            "<if test=\"selectStr != null and selectStr != ''\"> " +
//            "and c.name = #{selectStr} " +
//            "</if> " +
//            "</where>" +
//            "</script>")
//    MyPage<UserChildren> userChildrenPage(MyPage<UserChildren> myPage);
//
//
//    MyPage<User> mySelectPageMap(MyPage<User> pg, Map<String, Object> map);
//
//    List<User> mySelectMap(Map<String, Object> param);
//
//    List<User> myPageSelect(MyPage<User> myPage);
//
//    List<User> iPageSelect(IPage<User> myPage);
//
//    List<User> rowBoundList(RowBounds rowBounds, Map<String, Object> map);

}
