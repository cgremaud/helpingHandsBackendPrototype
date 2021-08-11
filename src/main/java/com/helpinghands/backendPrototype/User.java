package com.helpinghands.backendPrototype;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    private @Id @GeneratedValue Long id;
    private String name;
    private String location; //make a location Enum class?

    public User() {}

    public User(String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
}
