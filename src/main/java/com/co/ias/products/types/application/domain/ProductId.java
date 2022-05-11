package com.co.ias.products.types.application.domain;

import org.apache.commons.lang3.Validate;

public class ProductId {
    private final Integer value;

    public ProductId(Integer value) {
        Long valorId = 9999999999L;
        Validate.notNull(value,"ProductId no debe ser null");
        Validate.isTrue(value < valorId,"El product Id es muy grande");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  value.toString() ;
    }
}
