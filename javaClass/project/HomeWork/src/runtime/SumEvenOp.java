package runtime;

import java.util.Scanner;

public class SumEvenOp {
	public static void main(String[] args) {
		int n;
		int o = 0;
		int e = 0;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number:");
		n = Integer.parseInt(sc.nextLine());
		for(i = 0; i <= n; i++) {
			if(i % 2 == 0) {
				e += i;
			}else {
				o += i;
			}
		}
		System.out.printf("Sum of element EVEN: %d\n",e);
		System.out.printf("Sum of element OP: %d\n",o);
	}
}
