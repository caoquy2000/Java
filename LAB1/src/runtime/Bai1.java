package runtime;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		double dienTruoc = 0;
		double dienSau = 0;
		int flag;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.printf("\n Nhap tien dien thang truoc:");
				dienTruoc =	sc.nextDouble();
				System.out.printf("\n Nhap tien dien thang sau:");
				dienSau = sc.nextDouble();
			}
			catch(Exception e){
				System.out.println("\n Sai roi nhap lai");
			}
			do {
				flag = 0;
				if(dienTruoc >= dienSau) {
                                        System.out.println("Sai Roi");
					flag = 0;
					break;
				}else {
					System.out.printf("\n So kwh dien la %f kwh",dienSau-dienTruoc);
					flag = 1;
					break;
				}
			}while(flag!=1);
			
		}while(flag != 1);
	}
}
