package com.comp_accessory.computeraccessories.entity;

public enum Category {
    PC("Настольные компьютеры"), LAPTOP("Ноутбуки"), MONITOR("Мониторы"), HARD_DRIVE("Жесткие диски");
    private final String name;

    Category(String name) {
        this.name =name;
    }
    public String getName() {
        return name;
    }
}
