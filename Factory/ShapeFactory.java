package com.shape;

public class ShapeFactory  {
	public Shape getShape(String s) {
		if(s==null) {
			return null;
		}
		
		if(s.equals("circle")) {
			return new cricle();
		}
		if(s.equals("Rectangle")) {
			return new Reactangle();
		}
		return null;
		
	}
	

}
