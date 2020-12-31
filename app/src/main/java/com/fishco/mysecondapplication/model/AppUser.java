package com.fishco.mysecondapplication.model;

import java.io.Serializable;

public class AppUser implements Serializable {

    private String name;
    private String location;
    private String userId;
    private String description;

    public AppUser(String name, String location, String userId, String description) {
        this.name = name;
        this.location = location;
        this.userId = userId;
        this.description = description;
    }

    public AppUser(String name, String location, String userId) {
        this.name = name;
        this.location = location;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
