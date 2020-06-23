package data;

public class Star {
	String name;
	int yob;
	String nickname;
	String hit;

	
	public Star(String name, int yob, String nickname, String hit) {
		this.name = name;
		this.yob = yob;
		this.nickname = nickname;
		this.hit = hit;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYob() {
		return yob;
	}


	public void setYob(int yob) {
		this.yob = yob;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getHit() {
		return hit;
	}


	public void setHit(String hit) {
		this.hit = hit;
	}


	//method này đang được hiểu là 1 cái phễu
	public void showInfo() {
		System.out.println("tôi tên là "+ name+ " tôi sinh năm " + yob+ " tôi có nickname là "+
								nickname+" bài hit của tôi là " + hit);
	}
}
