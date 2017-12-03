package com.nan.phoenixdemo.service;

import com.nan.phoenixdemo.dto.UserInfoDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    /**
     * 保存用户信息测试
     */
    @Test
    public void testSaveUserInfo() {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUsername("zhangsan");
        userInfoDTO.setPassword("123456");
        userInfoDTO.setNickname("张三");
        userInfoDTO.setEmail("zhangsan@111.com");
        userInfoDTO.setBlog("zhangsan.com");
        userService.saveUserInfo(userInfoDTO);
    }

    /**
     * 查询用户信息测试
     */
    @Test
    public void testFindUserInfoByUsername() {
        UserInfoDTO userInfoDTO = userService.findUserInfoByUsername("zhangsan");
        System.err.println(userInfoDTO);
    }

}
