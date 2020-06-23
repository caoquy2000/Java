 package data;
//0. Cách tạo class con
//1. Đặc tính riêng của con thì con giữ,
//đặc tính chung với những con khác 
//thì gửi hết lên cho cha
//2. Cho con nhận cha bằng extends
//3. Tạo constructor cho con
//4. Về lí đã xong class con vì phần xài lại của cha
//có thể đã đủ
//mình có thể độ lại nếu cần
//hàm con trùng tên với hàm cha gọi là override độ lại,
//vượt mặt, con có quyền có những hàm riêng khác cha,
//khác cha.(tính chất bất hiếu trong mối quan hệ is a)
//Nhưng nếu cha là một abstract thì về toán và về hóa
//thì phải cần override.
//(nếu class mà extends abstract class mà k override thì các 
//abstract  method trong abstract class không đc  định nghĩa sẽ được class kế thừa như vậy thì class sẽ thành abstract class 
//nếu đã xác định class extends abstract class thì phải override)
//Việc override của class đối với abstract method gọi là unimpliment (định hình, xác định)
//lưu ý: phải unimpliment cho hết tất cả các abstract method 
//      nếu thiếu 1 abstract method chưa được unimpliment thì class đó phải bị biến thành abstract class
//=> hệ quả : không new được , không một object nào được tạo ra từ 1 khuôn vô hình cả
//shape ko được đúc (cả dòng họ vô sinh)
//Hình tròn là hình cụ thể, phải đúc được ra chứ
//=>con là abstract class thì các đời sau cũng có thể là 1 abstract class (hoặc viết đầy đủ, hoặc vô sinh)
public class Disk extends Shape{
	private double radius;
	public static final double PI = 3.14;
	//Tạo ra biến kiểu double có tên là PI không thể thay đổi giá trị
	//public: ở đâu cũng được sài nhưng mà phải new disk thì mới sài được
	//Hình tròn nào cũng sài PI giống nhau nên ta dùng static để dùng chung.
	//Disk.PI
	public Disk(String name, String color, double radius) {
		super(name, color);//Mang ý nghĩa là new cha(Shape)
		//Cha phải có trước thì mới có con.
		//Cha trước con sau
		this.radius = radius;
	}
	//Độ lại ngay tất cả các hàm đang abstract vì cha ko làm con phải làm
	//=>Tính đa hình
	@Override
	public double getAre() {
		return Disk.PI*Math.pow(radius, 2);
	}
	@Override
	public double getPerimeter() {
		return 2 * radius * PI;
	}
	@Override
	public void paint() {
		System.out.printf("DISK      |%-10s|%-10s|%-9.1f|%-6.2f|%-6.2f\n",name,color,radius,getAre(),getPerimeter());
	}
}
