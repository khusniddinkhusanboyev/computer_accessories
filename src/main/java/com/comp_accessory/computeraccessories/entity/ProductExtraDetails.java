package com.comp_accessory.computeraccessories.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Table(name = "product_extra")
public class ProductExtraDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "detailName")
    private String detailName;
    @Column(name = "detailValue")
    private String detailValue;

}
