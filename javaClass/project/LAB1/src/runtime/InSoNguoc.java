package runtime;

import java.util.Scanner;

public class InSoNguoc {
	public static void main(String[] args) {
		int n = 0; 
		int tmp = 0;
		int soNguoc = 0;
		int flag = 0;
		do {
			flag = 0;
			do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.printf("Enter a number:");
				n = sc.nextInt();
				flag = 1;
			}
			catch(Exception e) {
				System.out.printf("Ban nhap sai roi nhap lai di\n");
				flag = 0;
			}
			}while(flag!=1);
			while(n!=0) {
				tmp = n%10;
				soNguoc = soNguoc*10 + tmp;
				n=n/10;
			}
			System.out.printf("So nguoc la: %d", soNguoc);
			flag = 1;
		}while(flag != 1);
	}
}
