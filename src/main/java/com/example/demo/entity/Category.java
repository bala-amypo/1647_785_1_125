package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "categories")
    private Set<MenuItem> menuItems = new HashSet<>();

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Set<MenuItem> getMenuItems() { return menuItems; }
    public void setMenuItems(Set<MenuItem> menuItems) { this.menuItems = menuItems; }
}
