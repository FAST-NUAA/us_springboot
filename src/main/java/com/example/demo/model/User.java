package com.example.demo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class User {
    private int ID;
    private Date registerTime;
    private int userType;

    @JsonProperty(access = Access.WRITE_ONLY) //在输出的Json数据中隐藏密码，只能输入不输出
    private String userPassword;

    public User(int ID, String userPassword, Date registerTime, int userType) {
        this.ID = ID;
        this.userPassword = userPassword;
        this.registerTime = registerTime;
        this.userType = userType;
    }

    public User() {
        super();
    }

    
}
