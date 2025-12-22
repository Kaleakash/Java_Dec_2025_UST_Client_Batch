package com;

public class Product implements Comparable<Product>{
private int pid;
private String pname;
private float price;
@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
	System.out.println("Called..");
	System.out.println(this.pid+" - "+o.pid);
		//return this.pid-o.pid;		// asc order as pid 
	return o.pid- this.pid;
	}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int pid, String pname, float price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
}

}
