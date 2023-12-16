package com.study.elasticsearch.controller;

import com.study.elasticsearch.entity.Product;
import com.study.elasticsearch.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    Iterable<Product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping("/insert")
    Product insertProduct(@RequestBody Product product){
        return productService.insertProduct(product);
    }



}
