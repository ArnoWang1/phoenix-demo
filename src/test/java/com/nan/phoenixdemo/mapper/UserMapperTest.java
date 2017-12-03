package com.nan.phoenixdemo.mapper;

import com.nan.phoenixdemo.config.DruidConfig;
import com.nan.phoenixdemo.config.SessionFactoryConfig;
import com.nan.phoenixdemo.dto.UserInfoDTO;
import com.nan.phoenixdemo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {DruidConfig.class, SessionFactoryConfig.class})
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    /**
     * 保存用户测试
     */
    @Test
    public void testSave() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setCreateDate(new Date());
        int result = userMapper.save(user);
        System.err.println(result);
    }

    /**
     * 根据username查询用户
     */
    @Test
    public void testFindByUsername() {
        User user = userMapper.findByUsername("admin");
        System.err.println(user);
    }

    /**
     * 修改用户测试
     */
    @Test
    public void testDeleteByUsername() {
        userMapper.deleteByUsername("admin");
    }

    /**
     * 查询用户完整信息测试
     */
    @Test
    public void testFindUserInfoByUsername() {
        UserInfoDTO userInfoDTO = userMapper.findUserInfoByUsername("admin");
        System.err.println(userInfoDTO);
    }

}
