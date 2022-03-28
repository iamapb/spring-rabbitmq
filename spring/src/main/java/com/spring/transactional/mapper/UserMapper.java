package com.spring.transactional.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    @Insert("insert into user values (1, #{name})")
    void insert(@Param("name") String name);
}
