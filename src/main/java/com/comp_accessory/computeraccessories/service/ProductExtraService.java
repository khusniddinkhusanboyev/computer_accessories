package com.comp_accessory.computeraccessories.service;

import com.comp_accessory.computeraccessories.entity.ProductExtraDetails;
import com.comp_accessory.computeraccessories.repository.ProductExtraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductExtraService {

    private final ProductExtraRepository productExtraRepository;
    public List<ProductExtraDetails> addDetail(List<ProductExtraDetails> productExtraDetails){
        return productExtraRepository.saveAll(productExtraDetails);
    }


}
