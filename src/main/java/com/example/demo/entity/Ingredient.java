package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double costPerUnit;

    private Boolean active;

    // Getters and Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Double getCostPerUnit() { return costPerUnit; }

    public void setCostPerUnit(Double costPerUnit) { this.costPerUnit = costPerUnit; }

    public Boolean getActive() { return active; }

    public void setActive(Boolean active) { this.active = active; }
}
