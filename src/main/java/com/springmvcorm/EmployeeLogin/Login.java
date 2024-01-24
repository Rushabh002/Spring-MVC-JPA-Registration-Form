package com.springmvcorm.EmployeeLogin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {
    @Id
    private int id;
    private String email;
    private String username;
    private String pass;

    public Login(int id, String email, String username, String pass) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.pass = pass;
    }

    public Login() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
