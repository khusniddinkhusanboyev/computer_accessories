package com.comp_accessory.computeraccessories.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductExtraDTO {
   private Integer id;
   @NotNull(message = "Enter Detail Name")
   private String detailName;
   @NotNull(message = "Enter Detail Value")
   private String detailValue;

}
