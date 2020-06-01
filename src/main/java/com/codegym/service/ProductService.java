package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    List<Product> products = new ArrayList<>();
    public ProductService(){
        products.add(new Product("1", "phi", 6.6));
        products.add(new Product("2", "dao", 7));
        products.add(new Product("3", "van", 7.6));
    }
    @Override
    public boolean add(Product product) {
        products.add(product);
        return true;
    }

    @Override
    public boolean update(String id, Product product) {
        for (Product product1 : products){
            if (product1.getId().equals(id)){
                product1.setName(product.getName());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(String id) {
        for (Product product1 : products){
            if (product1.getId().equals(id)){
              products.remove(product1);
                return true;
            }
        }
        return false;
    }

    @Override
    public Product getProduct(String id) {
        for (Product product1 : products){
            if (product1.getId().equals(id)){
                return product1;
            }
        }
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return products;
    }
}
