package com.tns.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam
{
	public static void main(String[]args)
	{
//injecting the value for the dependency name (	
		//normal way)
//Student s= new Student();
//s.setStudentName("Rutuja k");
		
		
		  ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		  
		  Student s1=c.getBean("s1",Student.class);
		  s1.display();
		  
		 Student s2=c.getBean("s2",Student.class):
		 
		  s2.display();
		  

}
}
