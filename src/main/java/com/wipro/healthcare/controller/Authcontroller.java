package com.wipro.healthcare.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import com.wipro.healthcare.entity.User;
import com.wipro.healthcare.security.JwtUtil;
import com.wipro.healthcare.service.UserService;

@RestController
@RequestMapping("/auth")
public class Authcontroller {

    @Autowired
    private UserService service;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    // ✅ REGISTER
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return service.addUser(user);
    }

    // ✅ LOGIN
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getUsername(),
                        user.getPassword()
                )
        );

        if (authentication.isAuthenticated()) {
            return jwtUtil.generateToken(user.getUsername());
        } else {
            throw new UsernameNotFoundException("Invalid username or password");
        }
    }
}