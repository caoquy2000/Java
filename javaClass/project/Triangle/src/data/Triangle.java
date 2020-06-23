package data;

public class Triangle {
	protected String name;
	protected String color;
	protected double firstSide;
	protected double secondSide;
	protected double thirdSide;
	
	public Triangle(String name, String color, double firstSide, double secondSide, double thirdSide) {
		this.name = name;
		this.color = color;
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
	}
	
	
	public double computeArea() {
		return Math.sqrt(((firstSide + secondSide + thirdSide) / 2)*(((firstSide + secondSide + thirdSide) / 2) - firstSide)*(((firstSide + secondSide + thirdSide) / 2) - secondSide)*(((firstSide + secondSide + thirdSide) / 2) - thirdSide));
	}
	public double computePerimeter() {
		return firstSide + secondSide + thirdSide;
	}
	public void ShowInfor() {
		System.out.printf("\n|Triangle     |%-15s|%-15s|%6.2f|%6.2f|%6.2f|%6.2f|%6.2f",name,color,firstSide,secondSide,thirdSide,computeArea(),computePerimeter());
	}
}
