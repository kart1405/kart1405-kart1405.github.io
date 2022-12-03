package com.learn.maps;
class Base extends Exception {
	public Base() {
		// TODO Auto-generated constructor stub
	}
}
class Derived extends Base  {
	public Derived() {
		//super();
	}
}
 
public class Main {
  public static void main(String args[]) {
   // some other stuff
   try {
       // Some monitored code
       throw new Derived();
    }
 	    catch(Derived d)  { 
       System.out.println("Caught derived class exception"); 
    }
   catch(Base b)     { 
       System.out.println("Caught base class exception"); 
    }
  }
} 