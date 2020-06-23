
public class DemoOuterClass {
	public static void main(String[] args) {
		Person diep = new Person("LHDiep","Lê Hồ Điệp");
		diep.Show();
	}
}
class Person{
	private String id;
	private String name;
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public void Show() {
		System.out.println("name = "+this.name+" ,id = "+this.id);
	}
	
}