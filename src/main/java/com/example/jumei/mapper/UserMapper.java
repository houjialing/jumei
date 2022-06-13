package com.example.jumei.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jumei.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author: 侯家领
 * Date: 2022-06-12 16:55
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
