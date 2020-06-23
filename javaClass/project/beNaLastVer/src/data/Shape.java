package data;

public abstract class Shape {
	protected String name;
	protected String color;
	public Shape(String name, String color) {
		this.name = name;
		this.color = color;
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
	
	//Tinh dien tich va chu vi va in ra
	public abstract double getAre();
	public abstract double getPerimeter();
	public abstract void paint();
	//class chua ham(method-function) vay thi class phai la abstract
	//nhung ma mot class abstract ma khong chua ham abstract
	//=>neu Shapc c = new Shape(....);
	//neu ta ngoan co thi no van ra nhung no co ten la anonymous class
	
	
}
