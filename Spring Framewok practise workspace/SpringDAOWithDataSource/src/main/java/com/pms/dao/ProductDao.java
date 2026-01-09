package com.pms.dao;

import com.pms.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository						// database logic 
public class ProductDao {

    @Autowired
    DataSource ds;			// automatically search database connection in xml file using by type.

    public int storeProduct(Product product) {
        try {
            Connection con = ds.getConnection();
            PreparedStatement pstmt =
                 con.prepareStatement("insert into product values(?,?,?)");

            pstmt.setInt(1, product.getPid());
            pstmt.setString(2, product.getPname());
            pstmt.setFloat(3, product.getPrice());

            return pstmt.executeUpdate();		// insert the records 
        } catch (Exception e) {
            System.err.println(e);
            return 0;
        }
    }

    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        try {
            Connection con = ds.getConnection();
            PreparedStatement pstmt =
                    con.prepareStatement("select * from product");

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setPid(rs.getInt(1));
                product.setPname(rs.getString(2));
                product.setPrice(rs.getFloat(3));
                productList.add(product);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return productList;
    }

    // UPDATE
    public int updateProduct(Product product) {
        try {
            Connection con = ds.getConnection();
            PreparedStatement pstmt =
                    con.prepareStatement("update product set pname=?, price=? where pid=?");

            pstmt.setString(1, product.getPname());
            pstmt.setFloat(2, product.getPrice());
            pstmt.setInt(3, product.getPid());

            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
            return 0;
        }
    }

    // DELETE
    public int deleteProduct(int pid) {
        try {
            Connection con = ds.getConnection();
            PreparedStatement pstmt =
                    con.prepareStatement("delete from product where pid=?");

            pstmt.setInt(1, pid);

            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
            return 0;
        }
    }
}

