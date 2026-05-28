package com.fakeproduct.controller;

import com.fakeproduct.model.Product;
import com.fakeproduct.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/verify")
    public String verify(@RequestBody Product product) {
        return service.verify(product);
    }
}