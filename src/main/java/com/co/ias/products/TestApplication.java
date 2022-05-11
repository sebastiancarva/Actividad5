package com.co.ias.products;

import com.co.ias.products.types.application.domain.*;
import com.co.ias.products.types.application.models.ProductDTO;

public class TestApplication {
    public static void main(String[] args) {
        try {
            ProductId productId = new ProductId(45);
            ProductName productName = new ProductName("Headphones");
            ProductType productType = new ProductType(2);
            ProductPrice productPrice = new ProductPrice(80);
            ProductDiscount productDiscount = new ProductDiscount(0.0);

            Products products = new Products(productId,productType,productPrice,productName,productDiscount);

           //   OUTPUT
            /*
             *   ProductDTO productDTO = ProductDTO.fromDomain(products);
             */
            ProductDTO  productDTO = new ProductDTO(1,2,"Headphones",50,80.0);


            // INPUT para repositorio
            Products products1 = productDTO.toDomain();


        } catch (NullPointerException | IllegalArgumentException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}
