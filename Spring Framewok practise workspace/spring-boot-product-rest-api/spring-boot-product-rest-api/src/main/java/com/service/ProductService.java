package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	// no business logic. 
	public List<Product> findAllProducts() {
		return productRepository.findAll();	
		// findAll method part of JpaRepository which is responsible to 
		//retrieve records from database and convert to list 
	}
	
	public String findProductUsingId(int pid) {
	 Optional<Product> result	= productRepository.findById(pid); // record may present or not
	 if(result.isPresent()) {		// if present it return true 
		 Product productInDb = result.get();
		 return "Product name is "+productInDb.getPname();
	 }else {
		 return "Product not found";
	 }
	}
	
	public String storeProduct(Product product) {	// pid,pname,price etc 
		 Optional<Product> result	= productRepository.findById(product.getPid()); // record may present or not
		 if(result.isPresent()) {		// if present it return true 
			return "Product id must be unique";
		 }else {
			 productRepository.save(product);    // insert query 
			return "Product stored";
		 }
	}
	
	public String updateProductPrice(Product product) {	// pid,pname,price(new price) etc 
		 Optional<Product> result	= productRepository.findById(product.getPid()); // record may present or not
		 if(result.isPresent()) {		// if present it return true 
			 Product productInDb = result.get();    // productDb contains old name and price 
			  productInDb.setPrice(product.getPrice());  // replace by new price which contains in product object 
			  //productInDb.setPname(product.getPname());
			  productRepository.saveAndFlush(productInDb);   // update with new price 
			 return "Product price updated successfully";
		 }else {
			return "Product not present";
		 }
	}
	
	public String deleteProduct(int pid) {
		//productRepository.existsById(pid);
		 Optional<Product> result	= productRepository.findById(pid); // record may present or not
		 if(result.isPresent()) {		// if present it return true 
			productRepository.deleteById(pid);		// like delete query 
			 return "Product deleted";
		 }else {
			 return "Product not found";
		 }
		}
	
	public String storeAllProducts(List<Product> listOfProducts) {
		productRepository.saveAll(listOfProducts);
		return "All Product stored";
	}
	
}

