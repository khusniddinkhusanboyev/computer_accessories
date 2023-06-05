package com.comp_accessory.computeraccessories.service;

import com.comp_accessory.computeraccessories.entity.*;
import com.comp_accessory.computeraccessories.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return null;
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByType(Integer productTypesId){
        return null;
    }


}
