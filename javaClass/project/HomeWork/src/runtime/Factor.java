package runtime;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		int n;
		int i;
		int s = 1;
		int flag;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.printf("\nEnter the number: ");
			n  = Integer.parseInt(sc.nextLine());
			flag = 0;
			if(n>=20) {
				System.out.printf("Enter again");
				flag = 0;
			}else {
				flag = 1;
				break;
			}
		}while(flag!=1);
		for(i = 1; i <= n; i++) {
			s*=i;
		}
		System.out.printf("%d", s);
	}
}
