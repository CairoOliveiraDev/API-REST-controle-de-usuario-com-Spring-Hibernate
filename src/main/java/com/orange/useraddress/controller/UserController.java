package com.orange.useraddress.controller;

import com.orange.useraddress.dto.UserRequestDTO;
import com.orange.useraddress.dto.UserResponseDTO;
import com.orange.useraddress.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user/register")
    public ResponseEntity<UserResponseDTO> saveUser(@Valid @RequestBody UserRequestDTO user) {
        return userService.saveUser(user);
    }

    @GetMapping(value = "/user/search/{id}")
    public ResponseEntity<UserResponseDTO> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }
}
