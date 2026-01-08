package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "",method = RequestMethod.GET)
	public String openPage() {
		
		return "index";
	}
	
	@RequestMapping(value = "addPage",method = RequestMethod.GET)
	public String addProductPage(Model mm, Product pp) {
		mm.addAttribute("product", pp);
		return "addProduct";
	}
	
	@RequestMapping(value = "deletePage",method = RequestMethod.GET)
	public String deleteProductPage(Model mm, Product pp) {
		mm.addAttribute("product", pp);
		return "deleteProduct";
	}
	
	@RequestMapping(value = "updatePage",method = RequestMethod.GET)
	public String updateProductPage(Model mm, Product pp) {
		mm.addAttribute("product", pp);
		return "updateProduct";
	}
	
	@RequestMapping(value = "searchProductPage",method = RequestMethod.GET)
	public String searchProductPage(Model mm, Product pp) {
		mm.addAttribute("product", pp);
		return "searchProduct";
	}
	
	@RequestMapping(value = "addProductInDb",method = RequestMethod.POST)
	public String addProductInDb(Model mm, Product pp) {
		String result = productService.storeProduct(pp);
		pp.setPid(0);
		pp.setPname("");
		pp.setPrice(0.0f);
		pp.setQty(0);
		mm.addAttribute("product", pp);
		mm.addAttribute("result", result);
		return "addProduct";
	}
	
	
	@RequestMapping(value = "deleteProductFromDb",method = RequestMethod.POST)
	public String deleteProductFromDb(Model mm, Product pp) {
		String result = productService.deleteProduct(pp.getPid());
		pp.setPid(0);
		mm.addAttribute("product", pp);
		mm.addAttribute("result", result);
		return "deleteProduct";
	}
	
	@RequestMapping(value = "updateProductFromDb",method = RequestMethod.POST)
	public String updateProductFromDb(Model mm, Product pp) {
		String result = productService.updateProductPrice(pp);
		pp.setPid(0);
		pp.setPrice(0.0f);
		mm.addAttribute("product", pp);
		mm.addAttribute("result", result);
		return "updateProduct";
	}
	
	
	@RequestMapping(value = "searchProductFromDb",method = RequestMethod.POST)
	public String searhProductUsingPId(Model mm, Product pp) {
		Product p = productService.findProduct(pp.getPid());
		if(p==null) {
			mm.addAttribute("result", "Product not present");
		}else {
			mm.addAttribute("result", p.toString());
		}
		mm.addAttribute("product", pp);
		
		return "searchProduct";
	}
	
	@RequestMapping(value = "viewProducts",method = RequestMethod.GET)
	public String viewAllProduct(Model mm) {
		List<Product> products = productService.findAllProducts();
		mm.addAttribute("products", products);
		return "viewProducts";
	}
}
