package com.example.springsearch.entity.enums;

public enum ProductStatus {
    ON_SALE (1), STOP (0);

    private int value;

    ProductStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ProductStatus of(int value) {
        for (ProductStatus accountStatus :
                ProductStatus.values()) {
            if (accountStatus.getValue() == value) {
                return accountStatus;
            }
        }
        return ProductStatus.STOP;
    }
}
