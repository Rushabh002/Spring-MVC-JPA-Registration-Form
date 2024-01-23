package com.springmvcorm.EmployeeLogin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {
@Id
    private String email;
    private String username;
    private String pass;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Login(String email, String username, String pass) {
        this.email = email;
        this.username = username;
        this.pass = pass;
    }

    public Login() {
    }

    @Override
    public String toString() {
        return "Login{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
