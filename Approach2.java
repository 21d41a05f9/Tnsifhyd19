package com.srindu;

public class Approach2
{
	String batsman="virat kohli";
	static String bowler="siraj";
	  void view()
	{
		System.out.println("hello virat kohli");
	}
	static String view1()
	{ 
		return "ipl";	
	}
	public static void main(String[] args)  
	{
		Approach2 ap2=new Approach2();
		System.out.println(ap2.batsman);
		ap2.view();
		System.out.println(Approach2.bowler);
		System.out.println(Approach2.view1());
		
	}
	

}
