package com.example.jumei.controller.login;

import com.example.jumei.entity.User;
import com.example.jumei.rest.Result;
import com.example.jumei.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 侯家领
 * Date: 2022-06-12 15:26
 */
@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/appLogin")
    public Result appLogin(@RequestBody User user) {
        loginService.login();
        return Result.success();
    }
}
