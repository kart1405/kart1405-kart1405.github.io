package com.creational.designpattern.builder;

public class Main {
public static void main(String[] args) {
	Phone p=new PhoneBuilder().setName("Ram").getPhone();
	System.out.println(p.getName());
}
}
