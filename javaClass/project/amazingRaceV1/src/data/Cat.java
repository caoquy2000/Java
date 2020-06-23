package data;

import java.util.Random;

public class Cat extends Pet{
	private String ribbon;
	public static final double MAX_SPEED = 60.0;
	public Cat(String name, int yob, double weight,String ribbon) {
		super(name, yob, weight);
		// TODO Auto-generated constructor stub
		this.ribbon = ribbon;
	}

	@Override
	public double run() {
		return new Random().nextDouble() * MAX_SPEED;
	}

	@Override
	public void showRecord() {
		// TODO Auto-generated method stub
		System.out.printf("|Cat   |%-15s|%4d|%4.1f|%-5.1f|%-15s\n",name,yob,weight,run(),ribbon);
	}

}
