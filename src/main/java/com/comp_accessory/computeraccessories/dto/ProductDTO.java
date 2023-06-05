package com.comp_accessory.computeraccessories.dto;
import com.comp_accessory.computeraccessories.entity.Category;
import com.comp_accessory.computeraccessories.entity.Product;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Comparator;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
    private Long id;
    @NotNull(message = "Enter Serial Number")
    private String serialNumber;
    @NotNull(message = "Enter Manufacturer")
    private String manufacturer;
    @NotNull(message = "Enter Price")
    private double price;
    @NotNull(message = "Enter Quantity")
    private int quantity;
    private Category category;
    private List<ProductExtraDTO> productExtraDTOList;

    public static ProductDTO mapToProductDTO(Product product , List<ProductExtraDTO> productExtraDTOList){
        var  productExtraDTOS = productExtraDTOList.stream().sorted(Comparator.comparingInt(ProductExtraDTO::getId)).toList();
        return ProductDTO.builder()
                .id(product.getId())
                .serialNumber(product.getSerialNumber())
                .manufacturer(product.getManufacturer())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .category(product.getCategory())
                .productExtraDTOList(productExtraDTOS)
                .build();
    }
}
