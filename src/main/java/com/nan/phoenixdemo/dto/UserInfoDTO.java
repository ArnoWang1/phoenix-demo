package com.nan.phoenixdemo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class UserInfoDTO implements Serializable {

    @ApiModelProperty(value = "用户名", example = "admin", required = true)
    private String username;

    @ApiModelProperty(value = "用户密码", example = "admin", required = true)
    private String password;

    @ApiModelProperty(value = "用户昵称", example = "管理员", required = true)
    private String nickname;

    @ApiModelProperty(value = "用户邮箱", example = "admin@admin.com")
    private String email;

    @ApiModelProperty(value = "用户博客", example = "admin@admin.com")
    private String blog;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "UserInfoRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", blog='" + blog + '\'' +
                '}';
    }
}
