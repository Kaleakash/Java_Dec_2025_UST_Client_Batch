package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> listOfProduct = new ArrayList<Product>();
		listOfProduct.add(new Product(2, "Laptop", 560000));
		listOfProduct.add(new Product(1, "Computer", 350000));
		listOfProduct.add(new Product(3, "Mobile", 960000));
		listOfProduct.add(new Product(4, "Pen Drive", 1600));
		System.out.println("Before sort");
		for(Product p : listOfProduct) {
			System.out.println(p);
		}
			//Collections.sort(listOfProduct);
			Collections.sort(listOfProduct, new ProductSortBySalaryInAsc());
		System.out.println("After sort");
		for(Product p : listOfProduct) {
			System.out.println(p);
		}
	}

}
