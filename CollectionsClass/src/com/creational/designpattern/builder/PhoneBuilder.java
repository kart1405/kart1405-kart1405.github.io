package com.creational.designpattern.builder;

public class PhoneBuilder {
	private String name;
	private String specs;
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBuilder setSpecs(String specs) {
		this.specs = specs;
		return this;
	}
	public Phone getPhone() {
		return new Phone(name,specs);
	}
	
}
