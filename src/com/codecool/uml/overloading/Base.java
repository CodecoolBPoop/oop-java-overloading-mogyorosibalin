package com.codecool.uml.overloading;

public abstract class Base {
    int id;
    String name;
    String description;

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }
}
