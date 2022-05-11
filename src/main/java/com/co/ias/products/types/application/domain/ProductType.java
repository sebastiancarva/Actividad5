package com.co.ias.products.types.application.domain;

import org.apache.commons.lang3.Validate;

public class ProductType {
    private final Integer value;

    public ProductType(Integer value) {
        Validate.notNull(value,"El tipo de producto no puede ser null");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
