package com.arun.product.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ProductImpl implements Product {


    @Override
    public Product getProduct(String id) {

        return null;
    }
}
