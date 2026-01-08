package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProduct(Product product) {
		if(productDao.storeProduct(product)>0) {
			return "Product stored";
		}else {
			return "Product didn't store";
		}
	}
	
	public String deleteProduct(int pid) {
		if(productDao.deleteProduct(pid)>0) {
			return "Product deleted successfully";
		}else {
			return "Product not preset";
		}
	}
	
	public String updateProductPrice(Product product) {
		if(productDao.updateProductPrice(product)>0) {
			return "Product updated successfully";
		}else {
			return "Product not preset";
		}
	}
	
	public Product findProduct(int pid) {
		return productDao.findProduct(pid);
	}
	
	public List<Product> findAllProducts() {
		return productDao.findAllProducts();
	}
}
