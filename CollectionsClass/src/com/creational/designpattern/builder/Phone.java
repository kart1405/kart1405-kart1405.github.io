package com.creational.designpattern.builder;

public class Phone {

	private String name;
	private String specs;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Phone [name=");
		builder.append(name);
		builder.append(", specs=");
		builder.append(specs);
		builder.append(", getName()=");
		builder.append(getName());
		builder.append(", getSpecs()=");
		builder.append(getSpecs());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecs() {
		return specs;
	}
	public void setSpecs(String specs) {
		this.specs = specs;
	}
	public Phone(String name, String specs) {
		super();
		this.name = name;
		this.specs = specs;
	}

	
}
