package com.example.productservice.dto;

import lombok.Data;
import org.apache.catalina.LifecycleState;

import java.util.List;

@Data
public class Products {
    private List<Products> products;
    public Products() {}

    public Products(List<Products> products) {
        this.products = products;
    }
}
