package com.taskmanager.task_management.Service;

import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.stereotype.Service;

import com.taskmanager.task_management.Entity.User;
import com.taskmanager.task_management.Repository.UserRepository;


@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

 // Register User
    public User registerUser(User user) {

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already registered");
        }

        user.setRole("USER");
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }
    
 // Create Admin User
    public User createAdmin(User user) {

        user.setRole("ADMIN");

        user.setPassword(
            passwordEncoder.encode(user.getPassword())
        );

        return userRepository.save(user);
    }
      
  
 // Login User
 public User loginUser(String email, String password) {

     User user = userRepository.findByEmail(email)
             .orElseThrow(() ->
                     new RuntimeException("Invalid email or password"));

     if (password == null ||
             !passwordEncoder.matches(password, user.getPassword())) {

         throw new RuntimeException("Invalid email or password");
     }

     return user;
 }
 

    
}