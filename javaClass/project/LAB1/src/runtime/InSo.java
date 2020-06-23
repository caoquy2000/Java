package runtime;

import java.util.Scanner;

public class InSo {
	public static void main(String[] args) {
		int n = 0;
		int i;
		int tmp = 0;
		int s = 0;
		while(true) {
			n = getAnInt("Ban hay nhap so N:","Nhap lai!");
			if(n>0) break;
		}
		if(n<10) {
			System.out.printf("Khong co!");
		}else{
			System.out.println("Hello");
			for(i = 10 ; i <= n ; i++) {
				 
				if(isPrime(s)) {
					System.out.printf("%5d",i);
				}
			}
		}
		
	}
	public static int getAnInt(String inputSMG, String errorSMG) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			try {
				System.out.println(inputSMG);
				n = Integer.parseInt(sc.nextLine());
				return n;
			}
			catch(Exception e) {
				System.out.println(errorSMG);
			}
		}
	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++ ) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
