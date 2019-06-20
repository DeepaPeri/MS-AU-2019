package com.accolite.springMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accolite.employee.Employee;

public class Main {
		public static void main(String[] args) {
			ApplicationContext ac = new ClassPathXmlApplicationContext("file:src/main/resources/beans.xml");
			
			Employee e = (Employee)ac.getBean("employee");
			System.out.println(e);
			e.getEmployeeName();
		}

}
