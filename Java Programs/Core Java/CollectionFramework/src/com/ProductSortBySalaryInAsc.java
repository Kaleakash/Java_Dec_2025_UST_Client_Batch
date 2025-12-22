package com;

import java.util.Comparator;

public class ProductSortBySalaryInAsc implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getPrice()-o2.getPrice());
	}

}
