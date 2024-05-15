package com.srindu;

public class Add
{
	int sum(int x, int y )
	{
		return (x+y);
	}
	double sum(double x,double y)
	{
		return(x+y);
	}
static void display()
{
	System.out.println("hello");
}
static void display(int a)
{
	System.out.println("welcome");
}
public static void main(String[] args) {
	Add s=new Add();
	System.out.println(s.sum(20, 30));
	System.out.println(s.sum(1.3,4.3));
	Add.display();
	Add.display(10);
}

}