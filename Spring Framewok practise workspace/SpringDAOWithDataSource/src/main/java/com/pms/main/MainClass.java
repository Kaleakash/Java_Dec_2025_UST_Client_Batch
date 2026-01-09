package com.pms.main;

import com.pms.bean.Product;
import com.pms.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext ac =new ClassPathXmlApplicationContext("beans.xml");

        ProductService ps = (ProductService) ac.getBean("productService");

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== PRODUCT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:   // ADD PRODUCT
                    Product p = new Product();

                    System.out.print("Enter Product ID: ");
                    p.setPid(sc.nextInt());

                    System.out.print("Enter Product Name: ");
                    p.setPname(sc.next());

                    System.out.print("Enter Product Price: ");
                    p.setPrice(sc.nextFloat());

                    System.out.println(ps.storeProduct(p));
                    break;

                case 2:   // VIEW ALL
                    System.out.println("\n--- Product List ---");
                    List<Product> listOfProduct =  ps.findAll();
                    for(Product product : listOfProduct) {
                    	System.out.println(product);
                    }
                    break;

                case 3:   // UPDATE PRODUCT
                    Product up = new Product();

                    System.out.print("Enter Product ID to Update: ");
                    up.setPid(sc.nextInt());

                    System.out.print("Enter New Product Name: ");
                    up.setPname(sc.next());

                    System.out.print("Enter New Product Price: ");
                    up.setPrice(sc.nextFloat());

                    System.out.println(ps.updateProduct(up));
                    break;

                case 4:   // DELETE PRODUCT
                    System.out.print("Enter Product ID to Delete: ");
                    int pid = sc.nextInt();

                    System.out.println(ps.deleteProduct(pid));
                    break;

                case 5:
                    System.out.println("Thank you! Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
