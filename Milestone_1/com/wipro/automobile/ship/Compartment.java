package com.wipro.automobile.ship;

public class Compartment {
	 double height,width,breadth;
	Compartment(double height,double width, double breadth)
	{
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth()
	{
		return width;
	}
	public double getBreadth()
	{
		return breadth;
	}
	
	public static void main(String args[])
	{
		Compartment c = new Compartment(10.2,15.90,12);
		double height = c.getHeight();
		double width = c.getWidth();
		double breadth = c.getBreadth();
		System.out.println("Height Is : "+height);
		System.out.println("Width Is : "+width);
		System.out.println("Breadth Is : "+breadth);
	}

}

