package com.ProductManagementBackend.ProductManagemenet.Repository;

import com.ProductManagementBackend.ProductManagemenet.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepository extends JpaRepository<Product,Integer> {

}
