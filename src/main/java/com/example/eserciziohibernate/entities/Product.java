package com.example.eserciziohibernate.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Product extends BaseEntityData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private Double height;
    private Double width;
    private Double length;

    public Product(long id, String name, String description, Double height, Double width, Double length) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
}
