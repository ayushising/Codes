package com.shape;

public class Factory {
	   public static void main(String[] args) {
		   
		   ShapeFactory s= new ShapeFactory();
		   Shape s1=s.getShape("circle");
		   s1.shape();
		   Shape s2=s.getShape("Rectangle");
		   s2.shape();

		   
		   
	   }

}
