package com.nan.phoenixdemo.mapper;

import com.nan.phoenixdemo.model.User;
import com.nan.phoenixdemo.dto.UserInfoDTO;
import org.apache.ibatis.annotations.Param;

/**
 * 用户mapper
 */
public interface UserMapper {

    /**
     * 保存用户
     */
    int save(@Param("user") User user);

    /**
     * 根据username查询用户
     */
    User findByUsername(@Param("username") String username);

    /**
     * 根据username删除用户
     */
    int deleteByUsername(@Param("username") String username);

    /**
     * 根据username查询用户完整信息
     */
    UserInfoDTO findUserInfoByUsername(@Param("username") String username);
}
