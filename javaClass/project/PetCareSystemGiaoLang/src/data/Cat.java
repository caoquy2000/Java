package data;

import java.util.Random;

public class Cat extends Pet {
	public static final double MAX_SPEED = 30;

	public Cat(String id, String name, int yob, double weight) {
		super(id, name, yob, weight);

	}

	@Override
	public double run() {
		return new Random().nextDouble()*MAX_SPEED;
	}


	@Override
	public void showProfile() {
		String msg;
		msg = String.format("|%6s|%-15s|%4d|%4.1f|%4.1f", id,name,yob,weight,run());
		System.out.println(msg);
		//in thông tin chi tiết của Cat theo chuẩn saoi1 ca/tubular
		//giống lề excel
	}

}
