package com.jacobfrancois.spaceDatabase.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Permission {

    @Id
    @GeneratedValue
    private int id;

    private String device;

    private boolean active;

    public Permission() {
    }

    public Permission(int id, String device, boolean active) {
        this.id = id;
        this.device = device;
        this.active = active;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
