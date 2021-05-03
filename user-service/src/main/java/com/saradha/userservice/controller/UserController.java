package com.saradha.userservice.controller;


import com.saradha.userservice.entity.User;
import com.saradha.userservice.response.ResponseVO;
import com.saradha.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseVO getUserWithDepartment(@PathVariable("id") Long id) {
        return userService.getUserWithDepartment(id);
    }


}
