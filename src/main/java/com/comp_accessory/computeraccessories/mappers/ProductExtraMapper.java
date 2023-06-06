package com.comp_accessory.computeraccessories.mappers;


import com.comp_accessory.computeraccessories.dto.ProductExtraDTO;
import com.comp_accessory.computeraccessories.entity.ProductExtraDetails;

import java.util.List;


public class ProductExtraMapper {

    public static List<ProductExtraDTO> mapToExtraProductDTO(List<ProductExtraDetails> productExtraDetails) {
        return productExtraDetails.stream().map(extraDetail -> ProductExtraDTO.builder()
                .id(extraDetail.getId())
                .detailName(extraDetail.getDetailName())
                .detailValue(extraDetail.getDetailValue())
                .build()).toList();

    }

}
