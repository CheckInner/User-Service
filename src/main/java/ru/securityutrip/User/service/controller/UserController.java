package ru.securityutrip.User.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.securityutrip.User.service.dto.LoginRequest;
import ru.securityutrip.User.service.dto.LoginResponse;
import ru.securityutrip.User.service.dto.RegistrationRequest;
import ru.securityutrip.User.service.dto.RegistrationResponse;
import ru.securityutrip.User.service.service.UserService;

@RestController
@RequestMapping("/authentication")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/registration")
    public ResponseEntity<RegistrationResponse> registerUser(
        @RequestBody RegistrationRequest request
    ) {
        try {
            RegistrationResponse response = userService.registrateUser(request);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(
        @RequestBody LoginRequest request
    ){
        try{
            LoginResponse response = userService.loginUser(request);
            return ResponseEntity.ok(response);
        } catch (Exception e){
            return ResponseEntity.status(500).build();
        }
    }
}

