package com.srindu;

public class Demo 
{
	void display()
	{
		System.out.println("contains class A");
	
	}
	public class Demo1 extends Demo
	{
		void display()
		{
			System.out.println("containss class B");
		}
	}
}