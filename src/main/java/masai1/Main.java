package com.masai1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("com/masai1/emp.xml");
Employee em= (Employee)con.getBean("Emp1");
System.out.println(em.getName());
System.out.println(em.getPhone());
System.out.println(em.getAddresses());
System.out.println(em.getCourse());
	}

}
