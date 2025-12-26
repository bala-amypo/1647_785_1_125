package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ProfitCalculationRecord {

    @Id
    @GeneratedValue
    private Long id;

    private Long menuItemId;

    private double cost;

    private double price;

    private double profit;

    private LocalDateTime calculatedAt;

    public ProfitCalculationRecord() {
        this.calculatedAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getMenuItemId() { return menuItemId; }
    public void setMenuItemId(Long menuItemId) {
        this.menuItemId = menuItemId;
    }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getProfit() { return profit; }
    public void setProfit(double profit) { this.profit = profit; }

    public LocalDateTime getCalculatedAt() {
        return calculatedAt;
    }
}
