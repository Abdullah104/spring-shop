package com.example.spring_shop.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public record Product(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id, String name, String brand,
                      BigDecimal price, int inventory, String description,
                      @ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "category_id") Category category,
                      @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true) List<Image> images) {
}
