package com.csphere.sonique.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String name;
    public String email;
    public String password;

    private static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    public Customer(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public static String passwordHash(String password){
        return PASSWORD_ENCODER.encode(password);
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
}