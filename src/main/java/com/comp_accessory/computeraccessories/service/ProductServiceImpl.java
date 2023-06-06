package com.comp_accessory.computeraccessories.service;

import com.comp_accessory.computeraccessories.dto.ProductDTO;
import com.comp_accessory.computeraccessories.entity.*;
import com.comp_accessory.computeraccessories.mappers.ProductMapper;
import com.comp_accessory.computeraccessories.repository.ProductRepository;
import com.comp_accessory.computeraccessories.service.impl.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductDTO addProduct(Product product) {

        return ProductMapper.mapToProductDTO(productRepository.save(product));
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return ProductMapper.mapToProductDTO(productRepository.findAll());
    }

    @Override
    public List<ProductDTO> getProductsByCategory(ProductTypeEnum productTypeEnum) {
        return ProductMapper.mapToProductDTO(productRepository.findByCategory(productTypeEnum));
    }
    @Override
    public Optional<ProductDTO> getProductById(Long id) {
        var getProductById = productRepository.findById(id);
        return getProductById.map(ProductMapper::mapToProductDTO);
    }


}
