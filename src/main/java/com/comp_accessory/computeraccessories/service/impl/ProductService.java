package com.comp_accessory.computeraccessories.service.impl;

import com.comp_accessory.computeraccessories.dto.ProductDTO;
import com.comp_accessory.computeraccessories.entity.ProductTypeEnum;
import com.comp_accessory.computeraccessories.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

     ProductDTO addProduct(Product product);
     List<ProductDTO> getAllProducts();
     List<ProductDTO> getProductsByCategory(ProductTypeEnum productTypeEnum);
    public Optional<ProductDTO> getProductById(Long id);
    }
