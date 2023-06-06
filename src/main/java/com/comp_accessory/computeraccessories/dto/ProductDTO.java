package com.comp_accessory.computeraccessories.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

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
    @NotNull(message = "Enter Category")
    private String category;
    @JsonProperty("productExtra")
    private List<ProductExtraDTO> productExtraDTOList;

}
