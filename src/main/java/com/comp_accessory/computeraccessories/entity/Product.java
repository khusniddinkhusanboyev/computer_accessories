package com.comp_accessory.computeraccessories.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Product implements Serializable {
    private String serialNumber;
    private String producer;
    private BigInteger price;
    private Integer numberOfRemainingProducts;
}
