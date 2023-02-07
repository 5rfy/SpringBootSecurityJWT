package com.example.springbootsecurityjwt.Controllers;

import com.example.springbootsecurityjwt.user.User;
import com.example.springbootsecurityjwt.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/control")
@RequiredArgsConstructor
public class DemoController {

    private final UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<List<User>> sayHello() {

        return ResponseEntity.ok(userRepository.findAll());
    }
}
