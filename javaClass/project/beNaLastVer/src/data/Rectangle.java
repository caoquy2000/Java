package data;

public class Rectangle extends Shape {
	protected double length;
	protected double width;
	public Rectangle(String name, String color, double length, double width) {
		super(name, color);
		this.length = length;
		this.width = width;
	}
	@Override
	public double getAre() {
		return width*length ;
	}
	@Override
	public double getPerimeter() {
		return (width + length)*2;
	}
	@Override
	public void paint() {
		System.out.printf("RECTANGLE |%-10s|%-10s|%-4.1f|%-4.1f|%-6.2f|%-6.2f\n",name,color,width,length,getAre(),getPerimeter());
	}
	
}
