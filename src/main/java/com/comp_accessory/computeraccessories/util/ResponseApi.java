package com.comp_accessory.computeraccessories.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseApi {
    private boolean flag;
    private String message;
    private Object object;
}
