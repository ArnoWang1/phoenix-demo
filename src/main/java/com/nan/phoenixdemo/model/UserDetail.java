package com.nan.phoenixdemo.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户详情
 */
public class UserDetail implements Serializable {

    //用户名称
    private String username;

    //用户昵称
    private String nickname;

    //用户邮箱
    private String email;

    //用户博客
    private String blog;

    //创建时间
    private Date createDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", blog='" + blog + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
