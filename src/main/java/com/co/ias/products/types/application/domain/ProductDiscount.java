package com.co.ias.products.types.application.domain;

import org.apache.commons.lang3.Validate;

public class ProductDiscount {
    private final Double value;

    public ProductDiscount(Double value) {
        Integer start =0;
        Integer end = 80;
        Validate.inclusiveBetween( start,end,value );
        Validate.notNull(value,"Descuento desde el 0 hasta el 80%");
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
