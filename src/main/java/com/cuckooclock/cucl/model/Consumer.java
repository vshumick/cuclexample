package com.cuckooclock.cucl.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Consumer {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

    private Date birthdate;

    @ManyToOne
    @JoinColumn(name="clockid")
    private Clock clock;

    public  Consumer(){

    }

    public Consumer(int id, String name, String description, Date birthdate, Clock clock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.birthdate = birthdate;
        this.clock = clock;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Clock getClock() {
        return clock;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }
}
