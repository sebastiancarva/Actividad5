package com.co.ias.products.types.application.domain;

import org.apache.commons.lang3.Validate;

public class ProductPrice {
    private final Integer price;

    public ProductPrice(Integer price) {
        Validate.notNull(price,"El Precio no puede ser Null");
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return price.toString();
    }
}
