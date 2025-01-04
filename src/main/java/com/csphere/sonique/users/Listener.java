package com.csphere.sonique.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Listener extends Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    boolean isPremium;

    public Listener(String name, String email, String password, boolean isPremium){
        super(name, email, password);
        this.isPremium = isPremium;
    }
}
