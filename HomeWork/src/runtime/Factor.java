package runtime;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		int n;
		int i;
		int s = 1;
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nEnter the number: ");
		n  = Integer.parseInt(sc.nextLine());
//		if(n == 0) {
//			System.out.println(0);
//			
//		}else {
			for(i = 1; i <= n; i++) {
				s*=i;
			}
//		}
		System.out.printf("%d", s);
	}
}
