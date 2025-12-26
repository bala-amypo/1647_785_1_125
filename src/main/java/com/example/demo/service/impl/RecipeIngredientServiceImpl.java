package com.example.demo.service.impl;

import com.example.demo.entity.RecipeIngredient;
import com.example.demo.repository.RecipeIngredientRepository;
import com.example.demo.service.RecipeIngredientService;

import org.springframework.stereotype.Service;

@Service
public class RecipeIngredientServiceImpl
        implements RecipeIngredientService {

    private final RecipeIngredientRepository repo;

    public RecipeIngredientServiceImpl(RecipeIngredientRepository repo) {
        this.repo = repo;
    }

    @Override
    public RecipeIngredient addIngredientToMenuItem(RecipeIngredient ri) {
        return repo.save(ri);
    }

    @Override
    public Double getTotalQuantityOfIngredient(Long id) {
        return 0.0;
    }
}
