package com.learn.maps;
// Java Program to Illustrate Copy Constructor

// Class 1
class Complex {

	// Class data members
	private int re, im;

	// Constructor
	public Complex(int re, int im)
	{
		// this keyword refers to current instance itself
		this.re = re;
		this.im = im;
	}

	public Complex(Complex c1) {
		// TODO Auto-generated constructor stub
		this.im=c1.im;
		this.re=c1.re;
		System.out.println(this.im+this.re);
	}
}

// Class 2
// Main class
public class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of above class
		// inside main() method
		Complex c1 = new Complex((int)10.0, (int)15.0);

		// Note: compiler error here
		Complex c2 = new Complex(c1);
		System.out.println(c2);
	}
}
