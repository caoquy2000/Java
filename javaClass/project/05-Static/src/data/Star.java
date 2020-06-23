package data;

public class Star {
	String name;
	int yob;
	static String  gender;
	public Star(String name, int yob, String gender) {
		this.name = name;
		this.yob = yob;
		this.gender = gender;
	}
	public void showInfor() {
		System.out.println(name+" "+yob+" "+gender);
	}
}
