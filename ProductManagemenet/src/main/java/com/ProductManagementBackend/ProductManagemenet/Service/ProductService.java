package com.ProductManagementBackend.ProductManagemenet.Service;

import com.ProductManagementBackend.ProductManagemenet.Model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);

    public List<Product> getAll();

    public Product getProductByID(Integer ID)
        ;
    public String deleteProduct(Integer ID)
        ;
    public Product editProduct(Product product,Integer id);
}
