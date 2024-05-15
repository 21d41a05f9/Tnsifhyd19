package com.srindu;

public class Acess 
{
		public static void main(String[] args)
		{
			Simple s1=new Simple();
			System.out.println(s1.a);
			System.out.println(Simple.b);
			s1.display();
			Simple.view();
		}
}
