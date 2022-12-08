package com.learn.reflection;

import java.sql.SQLException;

public class Singleton {

	private  static Singleton s;

	private  Singleton() throws ClassNotFoundException, SQLException {
		super();
		// TODO Auto-generated constructor stub
		//System.out.println("hello");
		//Connection con=null;  
       }
	
	public static Singleton SingletonM() throws ClassNotFoundException, SQLException {
		
		if(s==null)
		{ 
			synchronized (Singleton.class) {
			s=new Singleton();
			
		}
			
		
		}
		 return s;
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, CloneNotSupportedException  {
		Singleton k=Singleton.SingletonM();
		k.clone();
	}
	
	
}
