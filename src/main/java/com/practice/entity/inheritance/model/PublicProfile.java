package com.practice.entity.inheritance.model;

import jakarta.persistence.Entity;

@Entity
public class PublicProfile extends Profile {
    private Integer issuesReported;

    public PublicProfile() {}

    public PublicProfile(ProfileType type, String username, String email, String zipcode, Integer issuesReported) {
        super(type, username, email, zipcode);
        this.issuesReported = issuesReported;
    }

    public Integer getIssuesReported() {
        return issuesReported;
    }

    public void setIssuesReported(Integer issuesReported) {
        this.issuesReported = issuesReported;
    }
}
