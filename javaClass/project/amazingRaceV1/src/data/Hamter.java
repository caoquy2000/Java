package data;

import java.util.Random;

public class Hamter extends Pet {
	public static final double MAX_SPEED = 10.0;
	public Hamter(String name, int yob, double weight) {
		super(name, yob, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double run() {
		
		return new Random().nextDouble() * MAX_SPEED;
	}

	@Override
	public void showRecord() {
		System.out.printf("|HAMTER|%-15s|%4d|%4.1f|%-5.1f\n",name,yob,weight,run());
		
	}
	
}
