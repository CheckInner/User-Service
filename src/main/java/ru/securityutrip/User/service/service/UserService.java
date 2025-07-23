package ru.securityutrip.User.service.service;

import org.springframework.stereotype.Service;
import ru.securityutrip.User.service.dto.LoginRequest;
import ru.securityutrip.User.service.dto.LoginResponse;
import ru.securityutrip.User.service.dto.RegistrationRequest;
import ru.securityutrip.User.service.dto.RegistrationResponse;

@Service
public class UserService {
    public RegistrationResponse registrateUser(RegistrationRequest request) {
        // TODO make registration
        return new RegistrationResponse();
    }

    public LoginResponse loginUser(LoginRequest request) {
        // TODO make login
        return new LoginResponse();
    }
}
