package com.comp_accessory.computeraccessories.repository;

import com.comp_accessory.computeraccessories.entity.Category;
import com.comp_accessory.computeraccessories.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(Category category);
    Optional<Product> findById(Long id);
}
