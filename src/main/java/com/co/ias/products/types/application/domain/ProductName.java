package com.co.ias.products.types.application.domain;

import org.apache.commons.lang3.Validate;

public class ProductName {
    private final String productName;

    public ProductName(String productName) {
        Validate.notNull(productName,"El nombre del producto es null");
        Validate.isTrue(productName.length() < 40,"El nombre del producto tiene mas de 40 caracteres");

        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}
