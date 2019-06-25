package com.mh.loginsample.entity;

import javax.persistence.*;

@Entity
@Table(name = "Login")
public class User {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private int id;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "Password")
    private String password;
    @Column(name = "IsActive")
    private boolean isActive;
    @Column(name = "HasAccess")
    private boolean hasAccess;
    @Column(name = "IsExpired")
    private boolean isExpired;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isHasAccess() {
        return hasAccess;
    }

    public void setHasAccess(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }
}
