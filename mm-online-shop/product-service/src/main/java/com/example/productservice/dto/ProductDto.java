package com.example.productservice.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Integer id;
    private String productName;
    private double price;
    private String categoryId;
    public ProductDto() {}

    public ProductDto(String productName, double price, String categoryId) {
        this.productName = productName;
        this.price = price;
        this.categoryId = categoryId;
    }
}
