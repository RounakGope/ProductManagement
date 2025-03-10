package com.ProductManagementBackend.ProductManagemenet.Controller;

import com.ProductManagementBackend.ProductManagemenet.Model.Product;
import com.ProductManagementBackend.ProductManagemenet.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    public ResponseEntity<?> saveProduct(@RequestBody Product product)
    {

        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllProduct()
    {
        return new ResponseEntity<>(productService.getAll(),HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public  ResponseEntity<?> getProductbyID(@PathVariable Integer id)
    {
        return new ResponseEntity<>(productService.getProductByID(id),HttpStatus.OK);

    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id)
    {

        return  new ResponseEntity<>(productService.deleteProduct(id),HttpStatus.OK);
    }
    @PutMapping ("/edit/{id}")

    public  ResponseEntity<?> editProduct(@RequestBody Product product,@PathVariable Integer id)
    {
        return new ResponseEntity<>(productService.editProduct(product,id),HttpStatus.CREATED);
    }
}
