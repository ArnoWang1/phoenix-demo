package com.nan.phoenixdemo.service;

import com.nan.phoenixdemo.dto.UserInfoDTO;
import com.nan.phoenixdemo.mapper.UserDetailMapper;
import com.nan.phoenixdemo.mapper.UserMapper;
import com.nan.phoenixdemo.model.User;
import com.nan.phoenixdemo.model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDetailMapper userDetailMapper;

    /**
     * 保存用户信息
     */
    public void saveUserInfo(UserInfoDTO userInfoDTO) {
        //用户基本信息
        User user = new User();
        user.setUsername(userInfoDTO.getUsername());
        user.setPassword(userInfoDTO.getPassword());
        user.setCreateDate(new Date());
        //用户详细信息
        UserDetail userDetail = new UserDetail();
        userDetail.setUsername(userInfoDTO.getUsername());
        userDetail.setNickname(userInfoDTO.getNickname());
        userDetail.setEmail(userInfoDTO.getEmail());
        userDetail.setBlog(userInfoDTO.getBlog());
        userDetail.setCreateDate(new Date());
        //保存到数据库
        userMapper.save(user);
        userDetailMapper.save(userDetail);
    }

    /**
     * 查询用户完整信息
     */
    public UserInfoDTO findUserInfoByUsername(String username) {
        return userMapper.findUserInfoByUsername(username);
    }

}
