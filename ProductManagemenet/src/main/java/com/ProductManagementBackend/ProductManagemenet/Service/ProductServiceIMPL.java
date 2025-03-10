package com.ProductManagementBackend.ProductManagemenet.Service;

import com.ProductManagementBackend.ProductManagemenet.Model.Product;
import com.ProductManagementBackend.ProductManagemenet.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceIMPL implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductByID(Integer ID) {
        return productRepository.findById(ID).get();
    }

    @Override
    public String deleteProduct(Integer ID) {
       Product product= productRepository.findById(ID).get();
        if(product!=null) {
            productRepository.delete(product);
            return "Product Deleted SuccessFully";
        }
        return "Something wrong on server";

    }

    @Override
    public Product editProduct(Product product, Integer id) {
        Product oldProduct=productRepository.findById(id).get();
        oldProduct.setProductName(product.getProductName());
        oldProduct.setPrice(product.getPrice());
oldProduct.setDescription(product.getDescription());
oldProduct.setStatus(product.getStatus());
return productRepository.save(oldProduct);
    }

}
