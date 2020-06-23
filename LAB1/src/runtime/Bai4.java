package runtime;

import java.util.Random;
import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		final int SO = 10;
		int a = new Random().nextInt() * SO;
		int n = 0;
		int count=0;
		int flag;
		do {
			flag = 0;
			do {
				try {
					Scanner sc = new Scanner(System.in);
					System.out.printf("Nhap so du doan:");
					n = sc.nextInt();
					flag = 1;
				}
				catch(Exception e) {
					System.out.printf("Sai roi ban oi nhap lai di \n");
					flag = 0;
				}
			}while(flag!=1);
			
			if(n == a) {
				System.out.printf("CHUC MUNG ban doan dung roi\n");
				flag = 1;
				break;
			}else {
				System.out.printf("Ban doan sai roi! \n");
				flag = 0;
			}
			count++;
			if(count == 3) {
				System.out.printf("Xin loi nha ban het luot doan roi!");
				flag = 1;
			}
		}while(flag != 1 || count!=3);
	}
}
