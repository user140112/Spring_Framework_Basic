package com.springpractice.first.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springpractice/first/test/beans/beans.xml");
    	
    	//Patient patient = (Patient) context.getBean("patient");
        //System.out.println(patient);  
    	Address address2 = (Address) context.getBean("address2");
    	System.out.println(address2);
    	
        ((ClassPathXmlApplicationContext) context).close();
    	
    }
}
