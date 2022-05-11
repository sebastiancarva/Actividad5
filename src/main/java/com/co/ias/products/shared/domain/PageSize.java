package com.co.ias.products.shared.domain;

import org.apache.commons.lang3.Validate;

public class PageSize {
    private final Integer value;

    public PageSize(Integer value) {
        Integer pageSize = value != null ? value:10;
        Validate.inclusiveBetween(10,30,pageSize,"Paginas de 10 a 30 es el rango");
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
