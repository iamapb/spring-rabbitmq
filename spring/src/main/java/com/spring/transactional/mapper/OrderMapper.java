package com.spring.transactional.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {

    @Insert("insert into order_item values (1, #{user_id}, #{price}) ")
    void add(@Param("user_id") Long userId, @Param("price") Integer price);

}
