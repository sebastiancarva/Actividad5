package com.co.ias.products.types.application.ports.out;

import com.co.ias.products.shared.domain.PageQuery;
import com.co.ias.products.types.application.domain.ProductId;
import com.co.ias.products.types.application.domain.Products;

import java.util.List;


public interface ProductRepository {
    // Metodos Creados
        Integer store(Products products); //Guardar
        Products get(ProductId productId); // Consultar
        void update(Products products); // Editar o Actualizar
        void delete(Products products); // Eliminar
        List<Products> getProducts(PageQuery pageQuery);

}
