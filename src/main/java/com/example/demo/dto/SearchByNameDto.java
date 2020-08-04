package com.example.demo.dto;

public class SearchByNameDto {
    private String name;

    public SearchByNameDto() {
    }

    public SearchByNameDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
