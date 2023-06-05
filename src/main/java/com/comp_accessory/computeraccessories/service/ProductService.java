package com.comp_accessory.computeraccessories.service;

import com.comp_accessory.computeraccessories.dto.ProductDTO;
import com.comp_accessory.computeraccessories.dto.ProductExtraDTO;
import com.comp_accessory.computeraccessories.entity.*;
import com.comp_accessory.computeraccessories.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductDTO addProduct(Product product) {
        return ProductDTO.mapToProductDTO(productRepository.save(product));
    }

    public List<ProductDTO> getAllProducts() {
        return ProductDTO.mapToProductDTO(productRepository.findAll());
    }

    public List<ProductDTO> getProductsByCategory(Category category) {
        return ProductDTO.mapToProductDTO(productRepository.findByCategory(category));
    }

    public Optional<ProductDTO> getProductById(Long id) {
        var getProductById = productRepository.findById(id);
        return getProductById.map(ProductDTO::mapToProductDTO);
    }


}
