package data;

public class Square {
	String name;
	String color;
	double width;
	
	public Square(String name,String color, double width) {
		this.name = name;
		this.color = color;
		this.width = width;
	}
	
	public double computeArea() {
		return width*width;
	}
	public double computePerimeter() {
		return width * 4;
	}
	public void showInfor() {
//		System.out.println("name: "+name+", color: "+color+", length: "+
//				length+", width: "+width+",Area: "+computeArea()+", Perimeter: "+ computePerimeter());
		System.out.printf("\n|Square   |%-15s|%-15s|%13.2f|%6.2f|%6.2f",name,color,width,computeArea(),computePerimeter());
	}
}
