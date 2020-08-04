package com.example.demo.dto;

public class UserDto {

    private Integer id;
    private String username;
    private String password;
    private String email;
    private String telefon;

    public UserDto(String username, String password, String email, String telefon) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.telefon = telefon;

    }

    public UserDto(Integer id, String username, String password, String email, String telefon) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.telefon = telefon;
    }

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}


