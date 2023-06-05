package com.comp_accessory.computeraccessories.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public enum Category {
    PC("Настольные компьютеры"), LAPTOP("Ноутбуки"), MONITOR("Мониторы"), HARD_DRIVE("Жесткие диски");
    private String name;
    
    Category(String name) {
        this.name =name;
    }
}
