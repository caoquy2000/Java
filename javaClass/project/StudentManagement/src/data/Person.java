package data;

import java.util.Scanner;

//Tạo ra class con người bao gồm các thuộc tính name, gender, yob
//Tạo hàm get/set và xây dựng hàm input infor cho person


public class Person {
	public String name;
	public String gender;
	public int yob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public void inputInfor() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		this.name = scanner.nextLine();
		
		System.out.println("Enter gender: ");
		this.gender = scanner.nextLine();
		
		System.out.println("Enter yob: ");
		this.yob = Integer.parseInt(scanner.nextLine());
	}
	
	public void showInfor() {
		System.out.printf("\nName: %10s| Gender: %10s| YoB: %10d",name,gender,yob);
	}
}
