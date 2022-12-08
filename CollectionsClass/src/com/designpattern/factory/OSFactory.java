package com.designpattern.factory;

public class OSFactory {

	public OS getObj(String objType) {
		if (objType.equals("Windows"))
			return new Windows();
		else if (objType.equals("Android"))
			return new Android();
		else 
			return new Others();
	}

}
