package runtime;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		int n = 0;
		int i;
                int count = 0;
		int tmp = 0;
		int s = 0;
                int j;
		while(true) {
			n = getAnInt("Ban hay nhap so N:","Nhap lai!");
			if(n>0) break;
		}
                if(n<10){
                    System.out.println("Khong co");
                }else{
		for(i = 10; i<=n;i++){
                    s=0;
                    count = i;
                    while(count!=0){
                        tmp = count%10;
                        s = s + tmp*tmp;
                        count = count/10;
                    }
                    if(isPrime(s)){
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
