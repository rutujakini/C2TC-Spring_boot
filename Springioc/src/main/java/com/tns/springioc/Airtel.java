 package com.tns.springioc;

public class Airtel implements Sim 
{
public Airtel()
{
	System.out.println("airtel constructor is called");
}
	public void calling() //abstract method
	{
		System.out.println("calling using airtel sim..!");
		
	}

	public void data()
	{
		System.out.println("browsing using airtel sim..!");
		
	}

}
