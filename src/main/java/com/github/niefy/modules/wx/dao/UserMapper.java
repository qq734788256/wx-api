package com.github.niefy.modules.wx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.niefy.modules.wx.entity.User;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@CacheNamespace(flushInterval = 300000L)//缓存五分钟过期
public interface UserMapper extends BaseMapper<User> {

    void unsubscribe(String openid);
}
