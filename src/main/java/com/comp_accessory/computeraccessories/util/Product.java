package com.comp_accessory.computeraccessories.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String serialNumber;
    private String producer;
    private BigInteger price;
    private Integer numberOfRemainingProducts;
}
