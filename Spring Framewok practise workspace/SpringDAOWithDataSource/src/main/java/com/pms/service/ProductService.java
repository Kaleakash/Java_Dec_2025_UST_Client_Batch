package com.pms.service;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDao productDao;

    public String storeProduct(Product product) {

        if (product == null) {
            return "Product object is null";
        }

        if (product.getPid() <= 0) {
            return "Product ID must be greater than zero";
        }

        if (product.getPname() == null || product.getPname().trim().isEmpty()) {
            return "Product name cannot be empty";
        }

        if (product.getPrice() <= 0) {
            return "Product price must be greater than zero";
        }

        int result = productDao.storeProduct(product);

        if (result > 0) {
            return "Product stored successfully";
        } else {
            return "Product not stored (duplicate ID or DB issue)";
        }
    }


    public List<Product> findAll() {
    	// apply some discount 
        return productDao.findAll();
    }

    public String updateProduct(Product product) {

        // Business validation
        if (product == null) {
            return "Product object is null";
        }

        if (product.getPid() <= 0) {
            return "Invalid product ID";
        }

        if (product.getPname() == null || product.getPname().trim().isEmpty()) {
            return "Product name cannot be empty";
        }

        if (product.getPrice() <= 0) {
            return "Product price must be greater than zero";
        }

        int result = productDao.updateProduct(product);

        if (result > 0) {
            return "Product updated successfully";
        } else {
            return "Product not found to update";
        }
    }


    public String deleteProduct(int pid) {

        // Business validation
        if (pid <= 0) {
            return "Invalid product ID";
        }

        int result = productDao.deleteProduct(pid);

        if (result > 0) {
            return "Product deleted successfully";
        } else {
            return "Product not found to delete";
        }
    }
}
