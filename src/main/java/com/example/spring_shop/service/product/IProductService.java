package com.example.spring_shop.service.product;

import com.example.spring_shop.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();

    List<Product> getProductsByCategory(Long category);

    List<Product> getProductsByBrand(String brand);

    List<Product> getProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductsByName(String name);

    List<Product> getProductsByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String category);

    Product getProductById(Long id);

    Product addProduct(Product product);

    void updateProduct(Product product, Long productId);

    void deleteProductById(Long id);


}
