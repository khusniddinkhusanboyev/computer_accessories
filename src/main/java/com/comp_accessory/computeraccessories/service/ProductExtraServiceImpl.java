package com.comp_accessory.computeraccessories.service;

import com.comp_accessory.computeraccessories.entity.ProductExtraDetails;
import com.comp_accessory.computeraccessories.repository.ProductExtraRepository;
import com.comp_accessory.computeraccessories.service.impl.ProductExtraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductExtraServiceImpl implements ProductExtraService {

    private final ProductExtraRepository productExtraRepository;



    @Override
    public List<ProductExtraDetails> addDetail(List<ProductExtraDetails> productExtraDetails) {
        return  productExtraRepository.saveAll(productExtraDetails);
    }
}
