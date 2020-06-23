package data;

import java.util.Random;

public class Dog extends Pet implements DeadRacer {
	public static final double MAX_SPEED = 50;
	public Dog(String name, int yob, double weight) {
		super(name, yob, weight);
	}

	@Override
	public double runToDead() {
		return run()*3;
	}

	@Override
	public void showToQuocGhiCong() {
		System.out.printf("|Dog   |%-15s|%4d|%4.1f|%-5.1f\n",name,yob,weight,runToDead());
		
	}

	@Override
	public double run() {
		// TODO Auto-generated method stub
		return new Random().nextDouble()*MAX_SPEED;
	}

	@Override
	public void showRecord() {
		System.out.printf("|Dog   |%-15s|%4d|%4.1f|%-5.1f\n",name,yob,weight,run());
		
	}
	
}
