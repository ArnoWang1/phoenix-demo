package com.nan.phoenixdemo.controller;

import com.nan.phoenixdemo.dto.UserInfoDTO;
import com.nan.phoenixdemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(description = "用户信息相关API文档")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户信息", notes = "按username条件查询用户信息", response = UserInfoDTO.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名",
                    required = true, dataType = "string", paramType = "query", defaultValue = "admin"),
    })
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    UserInfoDTO findUserInfoByUsername(@RequestParam("username") String username) {
        return userService.findUserInfoByUsername(username);
    }

    @ApiOperation(value = "添加用户信息", notes = "添加用户信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    Map<String, Object> saveUserInfo(@RequestBody UserInfoDTO userInfoDTO) {
        userService.saveUserInfo(userInfoDTO);
        Map<String, Object> map = new HashMap<>();
        map.put("result", true);
        map.put("msg", "Save success");
        return map;
    }
}
