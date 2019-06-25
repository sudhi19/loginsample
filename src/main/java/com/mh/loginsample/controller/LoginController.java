package com.mh.loginsample.controller;

import com.mh.loginsample.data.LoginDto;
import com.mh.loginsample.service.LoginService;
import com.mh.loginsample.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class LoginController {




        @Autowired
        private LoginService userService;
@GetMapping("/test")
public String testAPI()
{
    return "API up and Running";
}

        @PostMapping("/login")
        public ApiResponse login(@RequestBody LoginDto loginDto){
            return userService.login(loginDto);
        }
    }


