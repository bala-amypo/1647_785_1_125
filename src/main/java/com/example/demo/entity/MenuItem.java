package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MenuItem {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private double price;

    private boolean active = true;

    @ManyToMany
    private Set<Category> categories = new HashSet<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public Set<Category> getCategories() { return categories; }
    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
