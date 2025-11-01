package com.csphere.sonique.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String username;
    private String email;
    private String password;

    // artist fields
    private String stageName;
    private String genre;

    // listener fields
    private String favoriteGenre;
    private String country;
}
