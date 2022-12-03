package com.learn.maps;
// Java program to demonstrate lambda expressions to
// implement a user defined functional interface.

@FunctionalInterface

interface Test1 {
	int calculate(int x);
	
}

@FunctionalInterface

interface Test2 {
	int sum(int x);
	
}

public class Test {
	public static void main(String args[])
	{
		int a = 5;

		Test2 s=/*new Test2() {
			@Override
			public
			int sum*/
				(x) ->{
				x=x+8;
				return x;};
				
			/*};*/
		
		System.out.println(s.sum(8));
		
	}
}
