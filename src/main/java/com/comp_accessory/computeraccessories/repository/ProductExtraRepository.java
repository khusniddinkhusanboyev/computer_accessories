package com.comp_accessory.computeraccessories.repository;

import com.comp_accessory.computeraccessories.entity.ProductExtraDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductExtraRepository extends JpaRepository<ProductExtraDetails,Long> {

}
