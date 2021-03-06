package util;

import java.util.Scanner;

//Class dùng để chứa các hàm nhập xuất dữ liệu.


public class MyToys {
	private static Scanner scanner = new Scanner(System.in);
	// Hàm nhập vào số nguyên đích thực.
	// Nhập bậy bị chửi, nhập chuỗi bị chửi.
	//Chống trôi lệnh, tức là không để lại rác enter, hay kí tự nào đó trong buffer cho thằng sau hốt.
	//--có thể kiểm tra số nguyên trong 1 range/ khoản cho trước
	//sẽ có câu thông báo/ chữi tùy ngữ cách.
	public static int getAnInteger(String inputMsg, String errorMsg) {
		int n;
		while(true) {
			try {
				System.out.println(inputMsg);
				n = Integer.parseInt(scanner.nextLine());
				return n;
			} catch (Exception e) {
				System.out.println(errorMsg);
			}
		}
	}
	
	public static int getAnInteger(String inputMsg, String errorMsg, int lowerBound, int upperBound) {
		int n, tmp;
		if(lowerBound > upperBound) {
			tmp = upperBound;
			upperBound = lowerBound;
			lowerBound = tmp;
		}
		
		while(true) {
			try {
				System.out.println(inputMsg);
				n = Integer.parseInt(scanner.nextLine());
				if(n < lowerBound || n > upperBound) throw new Exception();
				return n;
			}catch(Exception e){
				System.out.println(errorMsg);
			}
		}
	}
	
	public static double getADouble(String inputMsg, String errorMsg) {
		double n;
		while(true) {
			try {
				System.out.println(inputMsg);
				n = Double.parseDouble(scanner.nextLine());
				return n;
			} catch (Exception e) {
				System.out.println(errorMsg);
			}
		}
	}
	
	public static double getADouble(String inputMsg, String errorMsg, double lowerBound, double upperBound) {
		double n, tmp;
		if(lowerBound > upperBound) {
			tmp = upperBound;
			upperBound = lowerBound;
			lowerBound = tmp;
		}
		
		while(true) {
			try {
				System.out.println(inputMsg);
				n = Double.parseDouble(scanner.nextLine());
				if(n < lowerBound || n > upperBound) throw new Exception();
				return n;
			}catch(Exception e) {
				System.out.println(errorMsg);
			}
		}
	}
//	Format dùng để chặn, hoặc ràng buộc các giá trị trong chuỗi
	public static String getID(String inputMsg, String errorMsg, String format) {
		String id;
		boolean match;
		while(true) {
			System.out.println(inputMsg);
			id = scanner.nextLine().trim().toUpperCase();
			match = id.matches(format);
			if(id.length() == 0 || id.isEmpty() || match == false) {
				System.out.println(errorMsg);
			}else {
				return id;
			}
		}
	}
	
	public static String getString(String inputMsg, String errorMsg) {
		String id;
		while(true) {
			System.out.println(inputMsg);
			id = scanner.nextLine().trim();
			if(id.length() == 0 || id.isEmpty()) {
				System.out.println(errorMsg);
			}else {
				return id;
			}
		}
	}
	
}


















