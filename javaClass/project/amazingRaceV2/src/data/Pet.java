package data;

public abstract class Pet {
	protected String name;
	protected int yob;
	protected double weight;
	
	public Pet(String name, int yob, double weight) {
		this.name = name;
		this.yob = yob;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", yob=" + yob + ", weight=" + weight + "]";
	}
	//mỗi đứa pet cụ thể có kiểu run khác nhau, nên ta để run() là abstract
	public abstract double run();
	//mỗi đứa khi về đích thì có cách ăn mừng khác nhau
	public abstract void showRecord();	
}
