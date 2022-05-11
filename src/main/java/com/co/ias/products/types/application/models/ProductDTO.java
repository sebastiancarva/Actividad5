package com.co.ias.products.types.application.models;

import com.co.ias.products.types.application.domain.*;

public class ProductDTO {
    /*
        productId:     number;
        typeOfProduct: number;
        name:          string;
        price:         number;
        discount?:     number;
     */
    private Integer productId;
    private Integer typeOfProducts;
    private String name;
    private Integer price;
    private Double discount;

    public ProductDTO(Integer productId, Integer typeOfProducts, String name, Integer price, Double discount) {
        this.productId = productId;
        this.typeOfProducts = typeOfProducts;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public Products toDomain(){
        return new Products(
                new ProductId(productId),
                new ProductType(typeOfProducts),
                new ProductPrice(price),
                new ProductName(name),
                new ProductDiscount(discount)
        );
    }
    public static ProductDTO fromDomain(Products products){
        return new ProductDTO(
                products.getProductId().getValue(),
                products.getProductType().getValue(),
                products.getProductName().getProductName(),
                products.getProductPrice().getPrice(),
                products.getProductDiscount().getValue()
        );
    }


    public ProductDTO() {
    }

    public Integer getProductId() {
        return productId;
    }

    public Integer getTypeOfProducts() {
        return typeOfProducts;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setTypeOfProducts(Integer typeOfProducts) {
        this.typeOfProducts = typeOfProducts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }


}
