package runtime;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		int soDien = 0;
		int tienDien = 0;
		int flag;
		do {
			flag = 0;
			do {
				try {
					Scanner sc = new Scanner(System.in);
					System.out.printf("Moi ban nhap vao so kwh dien:");
					soDien = sc.nextInt();
					flag = 1;
				}
				catch(Exception e) {
					System.out.printf("Ban nhap sai roi, nhap lai so di ban!\n");
					flag = 0;
				}
			}while(flag != 1);
				if(soDien<=0) {
					System.out.println("Moi ban nhap lai");
					flag = 0;
				}else if(soDien <= 100) {
					tienDien = soDien*1242;
					System.out.printf("Tien dien la: %d",tienDien);
					flag = 1;
				}else if((soDien > 101)&&(soDien >= 150)) {
					tienDien = (100*1242) + ((soDien-100)*1304);
					System.out.printf("Tien dien la: %d",tienDien);
					flag = 1;
				}else if((soDien > 151)&&(soDien >= 200)) {
					tienDien = (100*1242) + (50*1304) + ((soDien-150)*1651);
					System.out.printf("Tien dien la: %d",tienDien);
					flag = 1;
				}else if(soDien > 201) {
					tienDien = ((100*1242) + (50*1304) + (50*1651) +((soDien-200)*(1651+((soDien-200)*500))));
					System.out.printf("Tien dien la: %d",tienDien);
					flag = 1;
				}
		}while(flag != 1);
	}
}
