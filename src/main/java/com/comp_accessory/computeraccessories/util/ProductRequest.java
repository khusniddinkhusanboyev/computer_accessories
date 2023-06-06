package com.comp_accessory.computeraccessories.util;

import com.comp_accessory.computeraccessories.entity.ProductTypeEnum;
import com.comp_accessory.computeraccessories.entity.ProductExtraDetails;
import jakarta.validation.constraints.NotNull;
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

    private Long id;
    @NotNull(message = "Enter Serial Number")
    private String serialNumber;
    @NotNull(message = "Enter Manufacturer")
    private String manufacturer;
    @NotNull(message = "Enter Price")
    private double price;
    @NotNull(message = "Enter Quantity")
    private int quantity;
    @NotNull(message = "Enter Category")
    private ProductTypeEnum productTypeEnum;
     private List<ProductExtraDetails> productExtraDetails;
}
