package com.nan.phoenixdemo.mapper;

import com.nan.phoenixdemo.model.UserDetail;
import org.apache.ibatis.annotations.Param;

/**
 * 用户mapper
 */
public interface UserDetailMapper {

    /**
     * 保存用户
     */
    int save(UserDetail userDetail);

    /**
     * 根据username查询用户
     */
    UserDetail findByUsername(@Param("username") String username);

    /**
     * 根据username删除用户
     */
    int deleteByUsername(@Param("username") String username);

}
