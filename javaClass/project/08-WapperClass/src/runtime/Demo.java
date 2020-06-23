package runtime;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int a = 10;//primitive, 4 byte trong ram được cấp cho chứa 10.
		//khi mà ta new thì mới gọi là object.
		//a. chấm con cẹt.
		// integer đại diện cho int
		//Wapper Class
		//là những class 
		//mà object kiểu wapper sẽ được đóng gói/đóng hộp/bao bọc/chứa
		//các giá trị dữ liệu kiểu primitive tương ứng
		//Wapper class ý nghĩa: giúp dữ liệu trong java
		//hoàn toàn thuộc về kiểu đối tượng.
		//Ứng với mỗi kiểu primitive data type sẽ có một wapper class tương ứng
//		Wapper class                                         primitive data type
//		Character												char
//		Byte													byte
//		Short													short
//		Integer													int
//		Long													long
//		Float													float
//		Double													double
//		Boolean													boolean

//Tức là ở C ta có int long char double dùng để lưu data

//		nhưng ở java thì nó thích tất cả đều là object nên 
//		không thích dùng primitive data type nữa
//		Mà nó thích object data type hết nên tạo wapper class để thay thế thôi
		Integer b = new Integer(10);//unboxing đổ 10 vào bên trong cái lõi của Integer(biến int bên trong đó)
		//lõi của nó chính là primitive int 4 byte
		//Chơi cách này thì hao ram, cần biến con trỏ b, trỏ tới vùng new chà bá chứa lõi con bên trong
		//Cách này không khuyến khích, chơi ngầm, không chơi phễu.
		//gói 1 con int 10 thành hộp integer, gọi là boxing
		//boxing xảy ra khi Integer = primitive gán primitive vào wapper
		//Double = primitive 			Double x = new Double(3.14)
		System.out.println("a = "+ a);
		System.out.println("b = "+ b.toString());//toString	.show
//		show ra hết infor của class
		//gọi thầm tên em (toString).
		int c = b;
//		primitive = wapper class
//		á đù b con trỏ, trỏ vùng new Integer chà bá, trong lõi có con int 10
//		unboxing tự động, mò vào hộp Integer, rã đông nó ra	, lấy được lõi có con int 10
//		gán vào biến int c là hợp lí
//		unboxing xảy ra khi primitive bằng object class
		System.out.println("c = "+ c);
		
//		cách chơi sành điệu
		Integer d = 2000;
//		khỏi cần new Integer(), ta new ngầm Integer();
//		boxing chứ còn gì nữa
		
//		xài như bình thường
		System.out.println("d = " + d);
		System.out.println("sum = "+ (d+a));//Wapper +primitive
		// đóng mở tự động nên khỏi lo jvm thông minh hơn người nhiều.
		//wapper class primitive đều dùng như nhau.
//		so sánh là một câu truyện khác nhau đấy
		b  = 2000;
		
		if(d.equals(b)) {
			System.out.println("Bang nhau");
		}else {
			System.out.println("Khong bang nhau dau");
		}
		//wapper class so với wapper class
		//không auto unboxing (địa chỉ)
		//mãi mãi không bao giờ bằng nhau
		//wapper class so sánh với primitive data type
		//tự unboxing và lấy lõi ra so sánh
//		cấm tuyệt đối 2 biến object sài toán tử mà phải chấm đến bên trong để lấy lõi.
		
//		Integer có sài kĩ thuật buall
		
		
//		II.Immutable Class/Object: điều đặc biệt ở các Wapper Class là
		
//		chúng được thiết kế mà không có hàm setTer, hàm thay đổi value lõi trong unboxing
//		nếu muốn thay đổi giá trị bên trong ta phải cấp vùng nhớ boxing mới. các Wapper class thuộc immutable class
//		Immutable: là một đặc tính của một đối tượng nào đó trong lập trình
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number = ");
		
		int number = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Number = "+ number);
		
		
	}
}
//class Integer{
//	int a;
//	public Integer(int a) {
//		this.a=a;
//	}
//}
