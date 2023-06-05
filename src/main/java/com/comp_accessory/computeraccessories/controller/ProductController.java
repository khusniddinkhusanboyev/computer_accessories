package com.comp_accessory.computeraccessories.controller;

import com.comp_accessory.computeraccessories.dto.ProductDTO;
import com.comp_accessory.computeraccessories.entity.Category;
import com.comp_accessory.computeraccessories.entity.Product;
import com.comp_accessory.computeraccessories.repository.ProductRepository;
import com.comp_accessory.computeraccessories.service.ProductExtraService;
import com.comp_accessory.computeraccessories.service.ProductService;
import com.comp_accessory.computeraccessories.util.ProductRequest;
import com.comp_accessory.computeraccessories.util.ResponseApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;
    private final ProductExtraService productExtraService;
    private final ProductRepository productRepository;

    @PostMapping("/add-product")
    public ResponseEntity<?> addProduct(@RequestBody ProductRequest productRequest) {
        productExtraService.addDetail(productRequest.getProductExtraDetails());
        var addProduct = productService.addProduct(
                Product.builder()
                        .serialNumber(productRequest.getSerialNumber())
                        .manufacturer(productRequest.getManufacturer())
                        .price(productRequest.getPrice())
                        .quantity(productRequest.getQuantity())
                        .category(productRequest.getCategory())
                        .productExtraDetails(productRequest.getProductExtraDetails())
                        .build());
        return ResponseEntity.ok(new ResponseApi(true, "Product saved", addProduct));
    }

    @PutMapping("/update-product")
    public ResponseEntity<?> updateProduct(@RequestBody ProductRequest productRequest) {
        productExtraService.addDetail(productRequest.getProductExtraDetails());
        var addProduct = productService.addProduct(
                Product.builder()
                        .id(productRequest.getId())
                        .serialNumber(productRequest.getSerialNumber())
                        .manufacturer(productRequest.getManufacturer())
                        .price(productRequest.getPrice())
                        .quantity(productRequest.getQuantity())
                        .category(productRequest.getCategory())
                        .productExtraDetails(productRequest.getProductExtraDetails())
                        .build());

        return ResponseEntity.ok(new ResponseApi(true, "Product updated", addProduct));

    }


    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        List<ProductDTO> products = productService.getAllProducts();
        return ResponseEntity.ok(new ResponseApi(true, "All products", products));
    }

    @GetMapping("/{categoryEnum}")
    public ResponseApi getByCategory(@PathVariable("categoryEnum") String category) {
        List<ProductDTO> products = productService.getProductsByCategory(Category.valueOf(category));
        return new ResponseApi(true, "Product by Type", products);
    }

    @GetMapping("/product/{id}")
    private ResponseEntity<?> getProductById(@PathVariable("id") Long id) {
        if (!productService.getProductById(id).isPresent()) {
            ResponseEntity.ok(new ResponseApi(false, "Product not found", null));
        }
        return ResponseEntity.ok(new ResponseApi(true, "Product by id ", productService.getProductById(id)));

    }
}
