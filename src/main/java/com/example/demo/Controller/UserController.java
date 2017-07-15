package com.example.demo.Controller;

import com.example.demo.Models.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by Ouasmine on 14/07/2017.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUsers")
    public Collection<User> getUsers(){
        return userService.findAllUsers();
    }

    @PostMapping("registerUser")
    public User registerUser(@RequestBody User user){
        System.out.println(user);
        return userService.registerUser(user);
    }

}
