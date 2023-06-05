package com.comp_accessory.computeraccessories.dto;

import com.comp_accessory.computeraccessories.entity.Category;
import com.comp_accessory.computeraccessories.entity.ProductExtraDetails;
import jakarta.persistence.*;

import java.util.List;

public class ProductDTO {
    private String serialNumber;
    private String manufacturer;
    private double price;
    private int quantity;
    private Category category;
    private List<ProductExtraDetails> productExtraDetails;

    public static
}
