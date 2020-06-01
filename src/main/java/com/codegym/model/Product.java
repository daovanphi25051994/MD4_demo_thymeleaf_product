package com.codegym.model;

public class Product {
    private String id;
    private String name;

    public Product() {
    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
