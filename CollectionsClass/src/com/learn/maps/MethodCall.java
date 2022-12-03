 package com.learn.maps;
import java.lang.reflect.Method;
public class MethodCall extends A{  
public static void main(String[] args)throws Exception{  
  
    Class<?> c = Class.forName("A");  
    @SuppressWarnings("deprecation")
	Object o= c.newInstance();  
    Method m =c.getDeclaredMethod("message", null);  
    m.setAccessible(true);  
    m.invoke(o, null);  
}  
}  