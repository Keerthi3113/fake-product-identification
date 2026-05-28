package com.fakeproduct.service;

import com.fakeproduct.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final List<String> validBrands = Arrays.asList(
            "Apple", "Samsung", "Nike", "Adidas", "Sony"
    );

    public String verify(Product product) {

        boolean brandOk = validBrands.contains(product.getBrand());

        boolean codeOk = product.getProductCode() != null
                && product.getProductCode().length() >= 8;

        boolean sellerOk = product.getSeller() != null
                && !product.getSeller().equalsIgnoreCase("unknown");

        if (brandOk && codeOk && sellerOk) {
            return "✅ Likely Genuine Product";
        } else {
            return "❌ Warning: Possibly Fake Product";
        }
    }
}