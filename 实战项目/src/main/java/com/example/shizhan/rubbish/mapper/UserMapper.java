package com.example.shizhan.rubbish.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shizhan.rubbish.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
