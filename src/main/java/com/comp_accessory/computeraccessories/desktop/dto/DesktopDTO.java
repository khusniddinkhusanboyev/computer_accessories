package com.comp_accessory.computeraccessories.desktop.dto;

import com.comp_accessory.computeraccessories.desktop.model.Desktop;
import com.comp_accessory.computeraccessories.util.Product;
import lombok.*;

import java.math.BigInteger;
import java.time.LocalDate;

@AllArgsConstructor
public class DesktopDTO{
    private String serialNumber;
    private String producer;
    private BigInteger price;
    private Integer numberOfRemainingProducts;
    private String type;

    public static DesktopDTO mapToDesktopDTO(Desktop desktop) {
        var desktopDto = new DesktopDTO(
                desktop.getSerialNumber(),
                desktop.getProducer(),
                desktop.getPrice(),
                desktop.getNumberOfRemainingProducts(),
                desktop.getType()
        );
        return desktopDto;
    }

}
