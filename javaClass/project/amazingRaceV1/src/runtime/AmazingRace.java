package runtime;

import java.util.Random;

import data.*;
public class AmazingRace {
	public static void main(String[] args) {
		//đường đua bắt đầu
		Pet d1 = new Dog("Cậu Vàng",1950,10.0);
		Pet d2 = new Dog("Bê Tô", 2010,8.0);	//NNA
		Cat c1 = new Cat("KITTY", 1980,0,"ZUI");
		Pet h1 = new Hamter("MICKEY",1950,4.0);
		Pet racer[] = {d1,d2,c1,h1};
		//có 4 đua thủ/chưa biết là con gì, cứ khải mảng là khai báo biến hoi
		for (Pet o : racer) {
			o.showRecord();
		}
		//bàn riêng về Pet
		//đua trong đem,xuất hiện 1 thằng đen thui dí theo sau
		//con mèo  hay chó hay chuột
		//nhưng mình nhìn thoáng thôi cũng đoán đc con này nho nhỏ thôi
		//
		Pet xxx = new Pet("xxx",2020,0.5) {

			@Override
			public double run() {
				// TODO Auto-generated method stub
				return new Random().nextDouble() * 30;
			}

			@Override
			public void showRecord() {
				// TODO Auto-generated method stub
				System.out.printf("|XXX   |%-15s|%4d|%4.1f|%-5.1f\n",name,yob,weight,run());
			}
		};
		xxx.showRecord();
		Moto ex = new Moto("EXCITER 2K", 2020, 150,"56F8-2204"); //Mai mai khong chet
		Moto win = new Moto("WINNER 19", 2019, 150,"56F8-6789");
		ex.showRecord();
		win.showRecord();
		//giờ xe đòi vô rance 
		//nhưng nó quá khác biệt - gọi là interface
	}
}
