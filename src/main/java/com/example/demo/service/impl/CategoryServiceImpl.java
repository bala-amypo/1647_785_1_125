package com.example.demo.service.impl;

import com.example.demo.entity.Category;
import com.example.demo.exception.BadRequestException;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repo;

    public CategoryServiceImpl(CategoryRepository repo) {
        this.repo = repo;
    }

    @Override
    public Category createCategory(Category c) {

        Optional<Category> existing =
                repo.findByNameIgnoreCase(c.getName());

        if (existing.isPresent()) {
            throw new BadRequestException("Duplicate category");
        }

        return repo.save(c);
    }
}
