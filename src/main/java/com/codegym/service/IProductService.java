package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    boolean add(Product product);
    boolean update(String id, Product product);
    boolean remove(String id);
    Product getProduct(String id);
    List<Product> getAllProduct();
}
