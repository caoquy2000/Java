package data;

public class Rectangle {
	protected String name;
	protected String color;
	protected double length;
	protected double width;
	
	public Rectangle(String name,String color, double length, double width) {
		this.name = name;
		this.color = color;
		this.length = length;
		this.width = width;
	}
	//đã tạo xong constructor

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

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	//đã xong getter and setter
	
	public double computeArea() {
		return width * length;
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
