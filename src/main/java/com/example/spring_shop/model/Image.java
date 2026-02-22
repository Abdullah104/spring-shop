package com.example.spring_shop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.net.URI;
import java.sql.Blob;

@Entity
@Getter
@Setter
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String fileName;

    String fileType;

    Blob image;

    URI downloadUrl;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;
}
