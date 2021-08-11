package com.helpinghands.backendPrototype;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AbstractEntity {
    private @GeneratedValue @Id Long id;
    private String name;
    private String description;
}
