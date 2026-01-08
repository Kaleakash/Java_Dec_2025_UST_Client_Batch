package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@Repository
public class ProductDao {

	@Autowired
	EntityManagerFactory emf;			// like a connection 
	
	
	public int storeProduct(Product product) {
		EntityManager manager = emf.createEntityManager();		// like Statement or PreparedStatement
		EntityTransaction tran = manager.getTransaction();
		try {
		tran.begin();
			manager.persist(product);                        // like insert query 
		tran.commit();
		return 1;
		}catch(Exception e) {
			System.err.println(e);
			tran.rollback();
			return 0;
		}
	}
	
	public int deleteProduct(int pid) {
		EntityManager manager = emf.createEntityManager();		// like Statement or PreparedStatement
		EntityTransaction tran = manager.getTransaction();
		Product p = manager.find(Product.class, pid);		// 1st parameter entity and 2nd parameter pk 
		if(p==null) {
			return 0;
		}else {
			tran.begin();
				manager.remove(p);           // like delete query 
			tran.commit();
			return 1;
		}
	}
	
	public int updateProductPrice(Product product) {
		EntityManager manager = emf.createEntityManager();		// like Statement or PreparedStatement
		EntityTransaction tran = manager.getTransaction();
		Product p = manager.find(Product.class, product.getPid());		// 1st parameter entity and 2nd parameter pk 
		if(p==null) {
			return 0;
		}else {
			tran.begin();
				p.setPrice(product.getPrice());			//like update query 
					manager.merge(p);
			tran.commit();
			return 1;
		}
	}
	
	public Product findProduct(int pid) {
		EntityManager manager = emf.createEntityManager();	
		Product p = manager.find(Product.class, pid);
		return p;
	}
	
	public List<Product> findAllProducts() {
		EntityManager manager = emf.createEntityManager();	
		Query qry = manager.createQuery("select p from Product p");			// JPQL 
		List<Product> products	= qry.getResultList();
		return products;
	}
	
	public List<Product> findAllProductsByPrice(float price) {
		EntityManager manager = emf.createEntityManager();	
		Query qry = manager.createQuery("select p from Product p where p.price > :my_price");			// JPQL 
		qry.setParameter("my_price", price);
		List<Product> products	= qry.getResultList();
		return products;
	}
}



