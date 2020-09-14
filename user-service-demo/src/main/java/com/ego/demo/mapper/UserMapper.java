package com.ego.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ego.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {
}

