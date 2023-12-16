package com.study.elasticsearch.service;

import com.study.elasticsearch.entity.Product;
import com.study.elasticsearch.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    //Get
    public Iterable<Product> getProducts(){
      return productRepository.findAll();
    }

    //Post
    public Product insertProduct(Product product){
        return productRepository.save(product);
    }

    //Put
    public Product updateProduct(Product product, Long id){
        Product foundProduct = productRepository.findById(id).get();
        foundProduct.setPrice(product.getPrice());
        return foundProduct;
    }

    //Delete
    public void deleteProduct( Long id){
        productRepository.deleteById(id);
    }

}
