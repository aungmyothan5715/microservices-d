package com.example.productservice.service;

import com.example.productservice.entity.Product;
import com.example.productservice.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }
    public List<Product> findAllProduct() {
        return productRepo.findAll();
    }
    public Product findProductById(int id) {
        return productRepo.findProductById(id);
    }

}
