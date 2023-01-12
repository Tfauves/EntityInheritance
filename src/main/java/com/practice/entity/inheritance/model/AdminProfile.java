package com.practice.entity.inheritance.model;

import jakarta.persistence.Entity;

@Entity
public class AdminProfile extends Profile {
    private String serviceArea;

    public AdminProfile() {}

    public AdminProfile(ProfileType type, String username, String email, String zipcode, String serviceArea) {
        super(type, username, email, zipcode);
        this.serviceArea = serviceArea;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }
}
