package data;

public class Rectangle{
	protected String name;
	protected String color;
	protected double length;
	protected double width;
	public Rectangle(String name, String color, double length, double width) {
		this.name = color;
		this.color = color;
		this.length = length;
		this.width = width;
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

	public double getArea() {
		return width*length ;
	}
	
	public double getPerimeter() {
		return (width + length)*2;
	}
	
	public void paint() {
		System.out.printf("RECTANGLE |%-10s|%-10s|%-4.1f|%-4.1f|%-6.2f|%-6.2f\n",name,color,width,length,getArea(),getPerimeter());
	}
	
}
