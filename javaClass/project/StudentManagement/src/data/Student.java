package data;

import java.util.Scanner;

//Tạo class student kế thừa person, tạo phễu không đối số, tạo các hàm get set 
//lưu ý: class student này phải có id , GPA, email
public class Student extends Person {
	public String id;
	public double gpa;
	public String email;
	
	
//	get set
	public String getId() {
		return id;
	}
	public boolean setId(String id) {
		if(id != null) {
			this.id = id;
			return true;
		}else {
			System.err.println("Error!");
			return false;
		}
	}
	public double getGpa() {
		return gpa;
	}
	public boolean setGpa(double gpa) {
		if(gpa >= 0 && gpa <= 10) {
			this.gpa = gpa;
			return true;
		}else {
			System.err.println("Enter from 0 to 10.");
			return false;
		}
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		if(email != null && email.contains("@") && !email.contains(" ")) {
			this.email = email;
			return true;
		}else {
			System.err.println("Email phai co @ va khong co khoang trang");
			return false;
		}
	}
	@Override
	public void inputInfor() {
		super.inputInfor();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ID: ");
		while(true) {
			String inputID = scanner.nextLine();
			boolean check = setId(inputID);
			if(check) {
				break;
			}
		}
		
		System.out.println("Enter GPA: ");
		while(true) {
			double inputGPA = Double.parseDouble(scanner.nextLine());
			boolean check = setGpa(inputGPA);
			if(check) {
				break;
			}
		}
		
		System.out.println("Enter Email: ");
		while(true) {
			String inputEmail = scanner.nextLine();
			boolean check = setEmail(inputEmail);
			if(check) {
				break;
			}
		}
	}
	@Override
	public void showInfor() {
		System.out.printf("\nName: %10s| Gender: %10s| YoB: %10d| ID: %10s| GPA: %5.5f| Email: %20s ",name,gender,yob,id,gpa,email);
	}
	
	public boolean checkScholarship() {
		if(this.gpa >= 8) {
			return true;
		}
		return false;
	}
}
