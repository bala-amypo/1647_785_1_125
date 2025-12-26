package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "menu_items") // optional: specify table name
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // specify strategy
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private boolean active = true;

    // Getters and Setters
    public Long getId() { 
        return id; 
    }

    public void setId(Long id) { 
        this.id = id; 
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public boolean isActive() { 
        return active; 
    }

    public void setActive(boolean active) { 
        this.active = active; 
    }
}
