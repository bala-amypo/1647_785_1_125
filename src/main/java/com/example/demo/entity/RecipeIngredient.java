package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class RecipeIngredient {

    @Id
    @GeneratedValue
    private Long id;

    private Double quantity;

    @ManyToOne
    private Ingredient ingredient;

    @ManyToOne
    private MenuItem menuItem;

    // getters & setters
}
