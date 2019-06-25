package com.mh.loginsample.service;

import com.mh.loginsample.entity.User;
import com.mh.loginsample.data.LoginDao;
import com.mh.loginsample.data.LoginDto;
import com.mh.loginsample.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
    @Autowired
    private LoginDao loginDao;


    public ApiResponse login(LoginDto loginDto) {

        User user = loginDao.findByUserName(loginDto.getUserName());
        if(user == null) {
            return new ApiResponse(200, "User does not exists", null) ;
        }
        if(!user.getPassword().equals(loginDto.getPassword())){
            return new ApiResponse(200, "Invalid credentials", null) ;
        }
        if(!user.isActive()){
            return new ApiResponse(200, "Inactive user", null) ;
        }
        if(!user.isHasAccess()){
            return new ApiResponse(200, "User does not have sufficient access", null) ;
        }
        if(!user.isExpired()){
            return new ApiResponse(200, "Password Expired", null) ;
        }
        return new ApiResponse(200, "Login success", null) ;

    }
}
