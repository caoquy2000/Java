package data;

public abstract class Pet implements Comparable<Pet>{
	protected String id;
	protected String name;
	protected int yob;
	protected double weight;
	public Pet(String id, String name, int yob, double weight) {
		this.id = id;
		this.name = name;
		this.yob = yob;
		this.weight = weight;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//khám bệnh cũng test tốc độ nha, nhưng mà tốc độ 
	//chạy của bọn này chắc chắn khác nhau
	public abstract double run();
	
	//in ra thông tin chi tiết tốc chạy của từng pet
	public abstract void showProfile();
	
	
	
	//đố kỵ
	@Override 
	public int compareTo(Pet that) {
		return this.id.compareToIgnoreCase(that.id);
	}
	
	//so sánh id của các pet không quan tâm chó mèo
	
}