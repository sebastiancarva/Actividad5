package com.co.ias.products.types.application.domain;

public class Products {
    /*
        productId:     number;
        typeOfProduct: number;
        name:          string;
        price:         number;
        discount?:     number;
     */


    private final ProductId productId;
    private final ProductType productType;
    private final ProductPrice productPrice;
    private final ProductName productName;
    private final ProductDiscount productDiscount;

    public Products(ProductId productId, ProductType productType, ProductPrice productPrice, ProductName productName, ProductDiscount productDiscount) {
        this.productId = productId;
        this.productType = productType;
        this.productPrice = productPrice;
        this.productName = productName;
        this.productDiscount = productDiscount;
    }

    public ProductId getProductId() {
        return productId;
    }

    public ProductType getProductType() {
        return productType;
    }

    public ProductPrice getProductPrice() {
        return productPrice;
    }

    public ProductName getProductName() {
        return productName;
    }

    public ProductDiscount getProductDiscount() {
        return productDiscount;
    }
}
