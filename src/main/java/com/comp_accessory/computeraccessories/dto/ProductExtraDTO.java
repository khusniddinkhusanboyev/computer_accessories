package com.comp_accessory.computeraccessories.dto;
import com.comp_accessory.computeraccessories.entity.ProductExtraDetails;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductExtraDTO {
    private Integer id;
    @NotNull(message = "Enter Detail Name")
    private String detailName;
    @NotNull(message = "Enter Detail Value")
    private String detailValue;

}
