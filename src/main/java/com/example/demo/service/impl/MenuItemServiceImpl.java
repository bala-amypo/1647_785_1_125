package com.example.demo.service.impl;

import com.example.demo.entity.MenuItem;
import com.example.demo.repository.MenuItemRepository;
import com.example.demo.service.MenuItemService;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MenuItemServiceImpl implements MenuItemService {

    private final MenuItemRepository repo;

    public MenuItemServiceImpl(MenuItemRepository repo) {
        this.repo = repo;
    }

    @Override
    public MenuItem createMenuItem(MenuItem item) {
        return repo.save(item);
    }

    @Override
    public List<MenuItem> getAllMenuItems() {
        return repo.findAll();
    }

    @Override
    public void deactivateMenuItem(Long id) {
        MenuItem item = repo.findById(id).orElseThrow();
        item.setActive(false);
        repo.save(item);
    }
}
