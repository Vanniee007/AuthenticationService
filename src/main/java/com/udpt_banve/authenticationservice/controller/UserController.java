package com.udpt_banve.authenticationservice.controller;


import com.udpt_banve.authenticationservice.dto.request.ApiResponse;
import com.udpt_banve.authenticationservice.dto.request.UserCreationRequest;
import com.udpt_banve.authenticationservice.dto.response.UserCreationResponse;
import com.udpt_banve.authenticationservice.entity.User;
import com.udpt_banve.authenticationservice.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest request) {
        ApiResponse<User> response = new ApiResponse<>();
        response.setResult(userService.createUser(request));
        return response;
    }
    @GetMapping
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{username}")
    User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }
}
