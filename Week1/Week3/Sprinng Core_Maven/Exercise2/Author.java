package com.knowledge;

public class Author {
    private String name;
    private String expertise;

    public Author() {}

    public Author(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
