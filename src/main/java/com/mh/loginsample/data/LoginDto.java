package com.mh.loginsample.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

public class LoginDto {




    private String userName;

    private String password;



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
