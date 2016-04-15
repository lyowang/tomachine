package com.tomachine.dao;

import com.tomachine.model.Product;

import java.util.List;

/**
 * Created by twang on 4/15/16.
 */
public interface ProductDAO {
    List<Product> getAllProducts();
}
