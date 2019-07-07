package com.kunluo.bean;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @description: 用户实体类
 * @author: kunluo
 * @create: 2019-07-07 11:43
 **/
public class UserInfo {

    @Id
    private String id;
    // 用户名称
    @Column
    private String loginName;
    // 用户昵称
    @Column
    private String nickName;
    @Column
    private String passwd;
    // 用户姓名
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    // 头像
    @Column
    private String headImg;
    // 用户级别
    @Column
    private String userLevel;

    public UserInfo() {
    }

    public UserInfo(String id, String loginName, String nickName, String passwd, String name, String phoneNum, String email, String headImg, String userLevel) {
        this.id = id;
        this.loginName = loginName;
        this.nickName = nickName;
        this.passwd = passwd;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.headImg = headImg;
        this.userLevel = userLevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }
}
