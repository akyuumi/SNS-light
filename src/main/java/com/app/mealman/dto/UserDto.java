package com.app.mealman.dto;

import jakarta.persistence.*;

public class UserDto {
    
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "bio")
    private String bio;

    @Column(name = "profile_picture")
    private String profilePicture;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
