package ru.securityutrip.User.service.model;

import jakarta.persistence.*;
import ru.securityutrip.User.service.data.Role;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String firstName;
    private String lastName;

    private String phoneNumber;
    private String email;

    private List<Role> roles;
}
