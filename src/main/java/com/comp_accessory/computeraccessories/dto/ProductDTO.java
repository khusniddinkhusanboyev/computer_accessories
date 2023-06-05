package com.comp_accessory.computeraccessories.dto;

import com.comp_accessory.computeraccessories.entity.Category;
import com.comp_accessory.computeraccessories.entity.Product;
import com.comp_accessory.computeraccessories.entity.ProductExtraDetails;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
    private Long id;
    private String serialNumber;
    private String manufacturer;
    private double price;
    private int quantity;
    private Category category;
    private List<ProductExtraDetails> productExtraDetails;

    public static ProductDTO mapToProductDTO(Product product){
        return ProductDTO.builder()
                .id(product.getId())
                .serialNumber(product.getSerialNumber())
                .manufacturer(product.getManufacturer())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .category(product.getCategory())
                .productExtraDetails(product.getProductExtraDetails())
                .build();
    }
}
