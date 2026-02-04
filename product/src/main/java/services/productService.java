package services;

import java.util.List;

import entities.product;

public interface productService {

    product findByProductId(String proId);

    List<product> getAllProducts();

    List<product> getVerified();

    List<product> getSoldProducts();

}