package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://localhost:8080/findAllProducts
	
	@GetMapping(value = "findAllProducts",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProductDetails() {
		return productService.findAllProducts();
	}
	
	// http://localhost:8080/findProductByQuery?pid=100
	@GetMapping(value = "findProductByQuery")
	public String findProductUsingQueryParam(@RequestParam("pid") int pid) {	
		return productService.findProductUsingId(pid);
	}
	
		// http://localhost:8080/findProductByPath/100
		@GetMapping(value = "findProductByPath/{pid}")
		public String findProductUsingPathParam(@PathVariable("pid") int pid) {	
			return productService.findProductUsingId(pid);
		}
		
		// http://localhost:8080/storeProduct 
		// method : post 
		// {"pid":101,"pname":"Computer","price":35000}
		
		// @RequestBody annotation responsible to convert json data in object format. 
		@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String storeProductDetails(@RequestBody Product product) {
			return productService.storeProduct(product);
		}
		
		
		// http://localhost:8080/updateProductPrice 
		// method : patch 
		// {"pid":101,"price":45000}
		
		// @RequestBody annotation responsible to convert json data in object format. 
		@PatchMapping(value = "updateProductPrice",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateProductInfo(@RequestBody Product product) {
			return productService.updateProductPrice(product);
		}

		
		// http://localhost:8080/deleteProductById/100
		
		@DeleteMapping(value = "deleteProductById/{pid}")
		public String deleteProductUsingPid(@PathVariable("pid") int pid) {	
			return productService.deleteProduct(pid);
		}
		// http://localhost:8080/storeAllProducts
		// method : post 
		// [{"pid":101,"pname":"Computer","price":35000},{{"pid":101,"pname":"Computer","price":35000}}]
		
		@PostMapping(value = "storeAllProducts",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String storeAllProducts(List<Product> listOfProducts) {
			return productService.storeAllProducts(listOfProducts);
		}

}
