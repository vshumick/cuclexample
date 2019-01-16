package com.cuckooclock.cucl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Clock {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

    public  Clock(){

    }

    public Clock(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Clock(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
