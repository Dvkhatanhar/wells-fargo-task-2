package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @Column(nullable = false)
    private Portfolio portfolioId;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime purchaseDate;

    @Column(nullable = false)
    private int quantity;

    public Security() {
    }

    public Security(long securityId, Portfolio portfolioId, String name, String category, float purchasePrice, LocalDateTime purchaseDate, int quantity) {
        this.securityId = securityId;
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public Portfolio getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Portfolio portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        category = category;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
