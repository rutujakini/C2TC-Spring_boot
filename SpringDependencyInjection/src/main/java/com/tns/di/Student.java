package com.tns.di;

public class Student
{
	
private String studentName;
private int id;

//constructor
public Student(String studentName, int id) {
	
	this.studentName = studentName;
	this.id = id;
}
	public void display()
	{
		 System.out.println("Student name is:" +studentName +"and id is" +id);
	
}
}
          

//getter setter methods

//public void setId(int id) {
//	this.id = id;
//}
//public void setStudentName(String studentName) {
//	this.studentName = studentName;
//}
//public void display()
// {
//	 System.out.println("Student name is:" +studentName +"and id is" +id);
//	 
// }
//}

         