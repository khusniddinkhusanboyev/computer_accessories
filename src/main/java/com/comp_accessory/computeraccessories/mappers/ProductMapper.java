package com.comp_accessory.computeraccessories.mappers;
import com.comp_accessory.computeraccessories.dto.ProductDTO;
import com.comp_accessory.computeraccessories.entity.Product;

import java.util.List;

public class ProductMapper {
    public static ProductDTO mapToProductDTO(Product product) {
          return ProductDTO.builder()
                .id(product.getId())
                .serialNumber(product.getSerialNumber())
                .manufacturer(product.getManufacturer())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .category(product.getProductTypeEnum().getName())
                .productExtraDTOList(ProductExtraMapper.mapToExtraProductDTO(product.getProductExtra()))
                .build();
    }
    public static List<ProductDTO>mapToProductDTO(List<Product> product) {
         return product.stream().map(ProductMapper::mapToProductDTO).toList();
    }
}
