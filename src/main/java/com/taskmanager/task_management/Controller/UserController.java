package com.taskmanager.task_management.Controller;

import org.springframework.web.bind.annotation.*;

import com.taskmanager.task_management.Entity.User;
import com.taskmanager.task_management.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Register User
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    // Login User
    @PostMapping("/login")
    public User loginUser(@RequestParam String email,
                          @RequestParam String password) {
        return userService.loginUser(email, password);
    }
}