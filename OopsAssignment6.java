package com.Techment.day6.OopsAssignment;



public interface Polygon
{
	void calcArea();
	void calcPeri();
}
public class Rectangle  implements Polygon
{
	float length;
	float breadth;
	
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calcArea() 
	{
		float Area_Rect;
		Area_Rect=length*breadth;
	    System.out.println("Area of Rectangle:"+Area_Rect);
	}
	
	@Override
	public void calcPeri()
	{
		float  Perimeter_Rect;
		Perimeter_Rect=2*(length+breadth);
		System.out.println("Perimeter of Rectangle:"+Perimeter_Rect);
		
	}
	
}
public class Square implements Polygon
{
	float side;
      
	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public void calcPeri() 
	{
		float Perimeter_Square;
		Perimeter_Square=4*side;
	
	    
	    System.out.println("Perimeter of Square:"+Perimeter_Square);
		
	}
	
	public void calcArea()
	{	
		float Area_Square;
		Area_Square=side*side;
		System.out.println("Area of Square:"+Area_Square);
	}
}

public class OopsAssignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj1=new Square();
		Rectangle obj2=new Rectangle();
		obj2.setLength(4.5f); 
		obj2.setBreadth(3.6f);
		obj1.setSide(7.7f);
		
		obj1.calcArea();
		obj1.calcPeri();
		obj2.calcArea();
		obj2.calcPeri();

	}

}
