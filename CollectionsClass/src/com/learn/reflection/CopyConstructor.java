package com.learn.reflection;

public class CopyConstructor {

	private int k;
	private String name;
	
	
	public CopyConstructor(CopyConstructor C) {
		super();
		// TODO Auto-generated constructor stub
		k=C.k;
		name=C.name;
	}
	
	public CopyConstructor(int l,String name2) {
		super();
		// TODO Auto-generated constructor stub
		this.k=l;
		this.name=name2;
	}
	
	public static void main(String[] args) {
		
		CopyConstructor k0= new CopyConstructor(8, "kk");
		CopyConstructor k1= new CopyConstructor(k0);
		System.out.println(k1.k);
	}
	
}
