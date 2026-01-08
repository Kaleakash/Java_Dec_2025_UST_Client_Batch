package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Employee emp = new Employee();
//		emp.display();
//		Employee emp1 = new Employee();
		
		BeanFactory bean = new XmlBeanFactory(new ClassPathResource("beans.xml"));	// load the xml file as well as get the reference of BeanFactory 
		
//		Employee e1 = (Employee)bean.getBean("emp1");		// pull the object from container 
//		e1.display();
//		
//		Employee e2 = (Employee)bean.getBean("emp1");		// pull the object from container 
//		e2.display();
//		
//		System.out.println("--------------------");
//		
//		Employee e3 = (Employee)bean.getBean("emp2");		// pull the object from container 
//		e3.display();
//		
//		Employee e4 = (Employee)bean.getBean("emp2");		// pull the object from container 
//		e4.display();
		
		
//		Employee e5 = (Employee)bean.getBean("emp1");		// pull the object from container 
//		System.out.println(e5);               // it internally call toString method of employee class. 
//		
//		
//		Employee e6 = (Employee)bean.getBean("emp2");		// pull the object from container 
//		System.out.println(e6);               // it internally call toString method of employee class.
//		
//		Employee e7 = (Employee)bean.getBean("emp3");		// pull the object from container 
//		System.out.println(e7);               // it internally call toString method of employee class
//		
//		Employee e8 = (Employee)bean.getBean("emp4");		// pull the object from container 
//		System.out.println(e8);  
		
		
		Employee e9 = (Employee)bean.getBean("employee1");		// pull the object from container 
		System.out.println(e9); 
		
	}

}
