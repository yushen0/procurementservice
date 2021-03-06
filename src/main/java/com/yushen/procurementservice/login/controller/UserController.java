package com.yushen.procurementservice.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yushen.procurementservice.login.service.UserService;

/**
 * 登录功能
 * 
 * @class_name UserController.java
 * @package_name com.yushen.procurementservice.login.controller
 * @author liuyu1@bonc.com.cn
 * @date 2018年5月7日 下午2:23:50
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(name = "username") String username,
            @RequestParam(name = "password") String password,
            @RequestParam(name = "user_telephone") String user_telephone) {
        return userService.login(username,user_telephone, password);
    }

    /**
     * 
     * @param username
     * @param password
     * @param user_telephone
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam(name = "username") String username,
            @RequestParam(name = "password") String password,
            @RequestParam(name = "user_telephone") String user_telephone) {
        return userService.register(username, user_telephone,password);
    }

}
