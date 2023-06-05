package com.comp_accessory.computeraccessories.util;

import com.comp_accessory.computeraccessories.entity.Category;
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
public class ProductRequest {

    private String serialNumber;
    private String manufacturer;
    private double price;
    private int quantity;
    private Category category;
     private List<ProductExtraDetails> productExtraDetails;
}
