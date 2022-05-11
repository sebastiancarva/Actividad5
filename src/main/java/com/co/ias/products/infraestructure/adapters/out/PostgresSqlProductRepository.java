package com.co.ias.products.infraestructure.adapters.out;

import com.co.ias.products.shared.domain.PageQuery;
import com.co.ias.products.types.application.domain.ProductId;
import com.co.ias.products.types.application.domain.Products;
import com.co.ias.products.types.application.ports.out.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostgresSqlProductRepository implements ProductRepository {

    @Override
    public Integer store(Products products) {
        return null;
    }

    @Override
    public Products get(ProductId productId) {
        return null;
    }

    @Override
    public void update(Products products) {

    }

    @Override
    public void delete(Products products) {

    }

    @Override
    public List<Products> getProducts(PageQuery pageQuery) {
        return null;
    }
}
