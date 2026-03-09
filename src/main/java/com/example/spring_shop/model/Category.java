package com.example.spring_shop.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public record Category(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id, String name,
                       @OneToMany(mappedBy = "category") List<Product> products) {
}
