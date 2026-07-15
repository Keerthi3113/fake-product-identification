package com.fakeproduct.service;

import com.fakeproduct.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public String verify(Product product) {

        if(product.getProductName()==null || product.getProductName().isBlank())
            return "❌ Enter Product Name";

        if(product.getBrand()==null || product.getBrand().isBlank())
            return "❌ Enter Brand Name";

        if(product.getProductCode()==null || product.getProductCode().isBlank())
            return "❌ Enter Product Code";

        if(product.getSeller()==null || product.getSeller().isBlank())
            return "❌ Enter Seller Name";

        if(product.getProductCode().matches("\\d{8,14}")) {

            return """
            ✅ Product Verification Report

            Product Name : %s
            Brand : %s
            Product Code : %s
            Seller : %s

            Status : Product appears Genuine.

            Note:
            This verification is based on product information validation.
            """.formatted(
                    product.getProductName(),
                    product.getBrand(),
                    product.getProductCode(),
                    product.getSeller());

        }

        return """
        ⚠ Verification Failed

        Product Code is invalid.

        Product may be fake or incorrectly entered.
        """;
    }
}