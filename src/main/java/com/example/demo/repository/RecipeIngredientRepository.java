package com.example.demo.repository;

import com.example.demo.entity.RecipeIngredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeIngredientRepository
        extends JpaRepository<RecipeIngredient, Long> {

    List<RecipeIngredient> findByMenuItemId(Long id);

    @Query("SELECT SUM(r.quantity) FROM RecipeIngredient r WHERE r.ingredient.id = :id")
    Double getTotalQuantityByIngredientId(@Param("id") Long id);
}
