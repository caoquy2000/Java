package runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import data.*;

//xây dựng menu quản lí sinh viên bao gồm các chức năng sau.
//1.nhập vào một sinh viên
//2.hiển thị thông tin sinh viên
//3.hiển thị minmax trong điểm trung bình
//4.Tìm kiếm theo mã sinh viên
//5.sort từ a -> z theo tên siveen và hiển thị
//6.Hiển thị các sinh viên được học bổng và từ cao xuống thấp theo thứ tự giảm dần
//biết rằng sinh viên có học bổng khi có điểm GPA >= 8
//7.thoát
public class ManegementStudent {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		int choose;
		Scanner scanner = new Scanner(System.in);
		do {
			showMenu();
			System.out.println("\nEnter your choose: ");
			choose = Integer.parseInt(scanner.nextLine());
			switch(choose) {
				case 1:{//them sinh vien
					System.out.println("Enter student");
					Student std = new Student();
					std.inputInfor();
					studentList.add(std);
					break;
				}
				case 2:{
					if(studentList.isEmpty()) {
						System.out.println("Nothing to print");
						break;
					}else {
					for (Student o : studentList) {
						o.showInfor();
					}
					}
					break;
				}
				case 3:{
					int minIndex = 0;
					int maxIndex = 0;
					double minGpa, maxGpa;
					minGpa = studentList.get(0).getGpa();
					maxGpa = studentList.get(0).getGpa();
					for(int i = 0; i <= studentList.size()-1;i++) {
						if(studentList.get(i).getGpa() < minGpa) {
							minIndex = i;
							minGpa = studentList.get(i).getGpa();
						}
						if(studentList.get(i).getGpa() > maxGpa) {
							maxIndex = i;
							maxGpa = studentList.get(i).getGpa();
						}
					}
					System.out.println("1Student have max GPA: ");
					studentList.get(maxIndex).showInfor();
					System.out.println("Student have min GPA: ");
					studentList.get(minIndex).showInfor();
					break;
				}
				case 4:{
					if(studentList.isEmpty()) {
						System.out.println("Nothing to search.");
						break;
					}else {
						System.out.println("Enter student ID:");
				
						String keyID = scanner.nextLine();
						int count = 0;
						for (Student o : studentList) {
							if(o.getId().equalsIgnoreCase(keyID)) {
								o.showInfor();
								count++;
							}
						}
						if(count == 0) {
							System.out.println("Nothing to print");
						}
					}
				}
				case 5: {
					//sap81 xep danh sach sinh vien theo A-Z
					//B1. sắp xếp
					Collections.sort(studentList, new Comparator<Student>() {//anonymourse

						@Override
						public int compare(Student o1, Student o2) {
							if(o1.getName().compareTo(o2.getName()) >= 0) {
								return 1;
							}
							return -1;
						}
					});
					break;
				}
				case 6:{
					Collections.sort(studentList, new Comparator<Student>() {

						@Override
						public int compare(Student o1, Student o2) {
							if(o1.getGpa() >= o2.getGpa()) {
								return 1;
							}
							return -1;
						}
					});
					for (Student o : studentList) {
						if(o.checkScholarship()) {
							o.showInfor();
						}
					}
				}
				case 7:{
					System.out.println("Bye!");
					break;
				}
				default:{
					System.out.println("Please enter 1-7!");
					break;
				}
				
			}
		}while(choose != 7);
	}
	public static void showMenu() {
		System.out.printf("\n Menu: ");
		System.out.printf("\n 1-Add a student.");
		System.out.printf("\n 2-Show Infor Student.");
		System.out.printf("\n 3-Show Student MinMax GPA.");
		System.out.printf("\n 4-Search by ID.");
		System.out.printf("\n 5-Sort by Name.");
		System.out.printf("\n 6-Show Student Good.");
		System.out.printf("\n 7-Quit.");
	}
}
