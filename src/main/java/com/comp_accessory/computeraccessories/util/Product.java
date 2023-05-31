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
@Builder
public class Product {
    private String serialNumber;
    private LocalDate producedDate=LocalDate.now();
    private BigInteger price;
    private Integer numberOfRemainingProducts;
}
