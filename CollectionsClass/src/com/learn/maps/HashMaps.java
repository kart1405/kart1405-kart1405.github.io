package com.learn.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMaps {
	
 public HashMaps() {
	 
 }
	public static void main(String[] args) {
		Map<String,String> k= new HashMap<>();
		Map<String,String> k1= new TreeMap<>();
		Map<String,String> k2= new LinkedHashMap<>();
		k.put("f0a", "r");
		k.put("a2", "l");
		k.put("3h", "l1");
		
		for(Map.Entry<String, String> a: k.entrySet()) {
			System.out.println(a.getKey()+" "+a.getValue());
			
		}
		System.out.println("\n");
		k2.putAll(k);
		for(Map.Entry<String, String> a: k2.entrySet()) {
			System.out.println(a.getKey()+" "+a.getValue());
			
		}
		
		  k1.putAll(k); 
		  
		  for(Map.Entry<String, String> a: k1.entrySet()) {
		  System.out.println(a.getKey()+" "+a.getValue());
		  
		 }
		 
	}
}
