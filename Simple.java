package com.srindu;

public class Simple {
	int a=10;
	static int b=20;
	void display()
	{
		System.out.println("Hello prakash");
	}
	static void view()
	{
		System.out.println("welcome to sri indu collage");
	}
	
	public class Acess {
		public static void main(String[] args)
		{
			Simple s1=new Simple();
			System.out.println(s1.a);
			System.out.println(Simple.b);
			s1.display();
			Simple.view();
		}
	}

}
