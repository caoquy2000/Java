package data;

public class Rectangle {
	protected String name;
	protected String color;
	protected double width;
	protected double length;
	public Rectangle(String name, String color, double width, double length) {
		this.name = name;
		this.color = color;
		this.width = width;
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double computeArea() {
		return width*length;
	}
	public double computePerimeter() {
		return (width + length) * 2;
	}
	public void showInfor() {
//		System.out.println("name: "+name+", color: "+color+", length: "+
//				length+", width: "+width+",Area: "+computeArea()+", Perimeter: "+ computePerimeter());
		System.out.printf("\n|RECTANGLE|%-15s|%-15s|%6.2f|%6.2f|%6.2f|%6.2f",name,color,length,width,computeArea(),computePerimeter());
	}
}
