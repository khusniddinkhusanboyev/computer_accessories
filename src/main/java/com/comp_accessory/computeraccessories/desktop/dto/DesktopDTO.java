package com.comp_accessory.computeraccessories.desktop.dto;

import com.comp_accessory.computeraccessories.desktop.model.Desktop;
import com.comp_accessory.computeraccessories.util.Product;
import lombok.*;

import java.math.BigInteger;
import java.time.LocalDate;

@AllArgsConstructor
public class DesktopDTO extends Product {
    private String type;

    public DesktopDTO mapToDesktopDTO(Desktop desktop) {
        var desktopDto = new DesktopDTO(
                desktop.getSerialNumber(),
                desktop.getProducedDate(),
                desktop.getPrice(),
                desktop.getType(),
                desktop.getNumberOfRemainingProducts());
        return desktopDto;
    }

}
