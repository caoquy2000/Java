package runtime;

import java.util.Scanner;

public class TimSo {
	private static int[] a;

	public static void main(String[] args) {
		int n = 0;
		int flag;
		int check = 0;
		int even = 0;
		int op = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			n = getAnInteger("Vui long nhap vao so phan tu cua mang: ","Vui long nhap so nguyen");
			if(n > 0) break;
		}

		int a[] = new int[n];
		System.out.println("\nNhap so:");
		for(int i = 0; i < n;i++) {
			System.out.printf("a[%d]=",i);
			a[i] = getAnInteger("","Nhap lai di ban");
		}
		for(int i = 0; i <= n-1; i++) {
			if(a[i] > 0){
				count++;
			}
			if(a[i]%2 == 0) {
				even++;
			}else if(a[i]%2 == 1) {
				op++;
			}
			if(isPrime(a[i])) {
				check++;
			}
		}
		System.out.printf("Co %d so chan \n Co %d so le \n Co %d so duong\n Co %d so nguyen to", even, op, count, check);
	}
	
	public static int getAnInteger(String inputMsg, String erroMsg) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			try {
				System.out.println(inputMsg);
				n = Integer.parseInt(sc.nextLine());
				return n;
			}catch(Exception e) {
				System.out.println(erroMsg);
			}
		}
		
	}
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
