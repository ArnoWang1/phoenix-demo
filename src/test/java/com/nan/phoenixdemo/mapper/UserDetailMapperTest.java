package com.nan.phoenixdemo.mapper;

import com.nan.phoenixdemo.config.DruidConfig;
import com.nan.phoenixdemo.config.SessionFactoryConfig;
import com.nan.phoenixdemo.model.UserDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {DruidConfig.class, SessionFactoryConfig.class})
public class UserDetailMapperTest {

    @Autowired
    private UserDetailMapper userDetailMapper;

    /**
     * 保存用户测试
     */
    @Test
    public void testSave() {
        UserDetail userDetail = new UserDetail();
        userDetail.setUsername("admin");
        userDetail.setNickname("管理员");
        userDetail.setEmail("admin@admin.com");
        userDetail.setBlog("admin.com");
        userDetail.setCreateDate(new Date());
        int result = userDetailMapper.save(userDetail);
        System.err.println(result);
    }

    /**
     * 根据username查询用户
     */
    @Test
    public void testFindByUsername() {
        UserDetail userDetail = userDetailMapper.findByUsername("admin");
        System.err.println(userDetail);
    }

    /**
     * 修改用户测试
     */
    @Test
    public void testDeleteByUsername() {
        userDetailMapper.deleteByUsername("admin");
    }

}
