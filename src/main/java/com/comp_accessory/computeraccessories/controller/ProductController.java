package com.comp_accessory.computeraccessories.controller;

import com.comp_accessory.computeraccessories.dto.ProductDTO;
import com.comp_accessory.computeraccessories.entity.ProductTypeEnum;
import com.comp_accessory.computeraccessories.entity.Product;
import com.comp_accessory.computeraccessories.repository.ProductRepository;
import com.comp_accessory.computeraccessories.service.ProductExtraServiceImpl;
import com.comp_accessory.computeraccessories.service.ProductServiceImpl;
import com.comp_accessory.computeraccessories.util.ProductRequest;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "ProductController", description = "zer")
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {
    private final ProductServiceImpl productServiceImpl;
    private final ProductExtraServiceImpl productExtraService;
    private final ProductRepository productRepository;

    @PostMapping("/add")
    public ProductDTO addProduct(@Valid @RequestBody ProductRequest productRequest) {
        productExtraService.addDetail(productRequest.getProductExtraDetails());
        return productServiceImpl.addProduct(
                Product.builder()
                        .serialNumber(productRequest.getSerialNumber())
                        .manufacturer(productRequest.getManufacturer())
                        .price(productRequest.getPrice())
                        .quantity(productRequest.getQuantity())
                        .productTypeEnum(productRequest.getProductTypeEnum())
                        .productExtra(productRequest.getProductExtraDetails())
                        .build());
    }

    @PutMapping("/update")
    public ProductDTO updateProduct(@Valid @RequestBody ProductRequest productRequest) {
        return productServiceImpl.addProduct(
                Product.builder()
                        .id(productRequest.getId())
                        .serialNumber(productRequest.getSerialNumber())
                        .manufacturer(productRequest.getManufacturer())
                        .price(productRequest.getPrice())
                        .quantity(productRequest.getQuantity())
                        .productTypeEnum(productRequest.getProductTypeEnum())
                        .productExtra(productRequest.getProductExtraDetails())
                        .build());


    }


    @GetMapping("/all")
    public List<ProductDTO> getAll() {

        return productServiceImpl.getAllProducts();

    }

    @GetMapping("/{categoryEnum}")
    public List<ProductDTO> getByCategory(@Valid @PathVariable("categoryEnum") String category) {

        return productServiceImpl.getProductsByCategory(ProductTypeEnum.valueOf(category));
    }

    @GetMapping("/product/{id}")
    private ProductDTO getProductById(@PathVariable("id") Long id) {
        if (!productServiceImpl.getProductById(id).isPresent()) {
            return null;
        }
        return productServiceImpl.getProductById(id).get();
    }
}
