package data;

import java.util.Scanner;

public class Book {
	private String bookname;
	private String createdAt;
	private String nickname;

	public Book(String bookname, String createdAt, String nickname) {

		this.bookname = bookname;
		this.createdAt = createdAt;
		this.nickname = nickname;
	}
	public Book() {
		
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name's book: ");
		this.bookname = scanner.nextLine();
		System.out.println("Enter CreateAt: ");
		this.createdAt = scanner.nextLine();
		System.out.println("Enter nick name: ");
		this.nickname = scanner.nextLine();
	}
	public void showInfor() {
		System.out.printf("%10s | %10s | %10s", bookname, createdAt, nickname);
	}
}
