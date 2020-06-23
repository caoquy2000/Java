package program;

import java.util.Random;

import data.*;

public class BenaRun {
	public static void main (String[] args) {
		//Bé Na chơi lớn, mảng shape ngay từ đầu luôn
		Shape ds[] = new Shape[4];
		ds[0] = new Disk("Tía", "pink", 2.0);
		ds[1] = new Rectangle("Hường", "Hồng", 2, 3);
		ds[2] = new Square("Lục", "Green", 5);
		
		Disk d = new Disk("Mợ", "Hường", 10);
		ds[3] = d;
		for (Shape o : ds) {
			o.paint();
		}
		
		//Rectangle r1 = new Square("Mo","more",2);
		
		//=>Muốn có object ta cần (không quan nó là class con hay class độc lập)
		//khuôn , phễu là điều hiển nhiên chỉ cần quan tâm constructor
		//new gọi phễu, 
		//biến con trỏ thành new ???, trỏ đến vùng new
		//DogChiPu = New Dog(???)
		//object con có gì khác ko?
		//giống như công thức trên cũng cần khuôn, new, biến (vidu: square v = new ...)
		//nhưng nếu nhìn vào vùng ram của con thì có chút đặc biệt
		
		
		// Tuy nhiên nếu nhìn xâu vào vùng ram của con sẽ có chút đặc biệt.
		// Nhìn tổng thể nó vẫn là một vùng new to
		// nhưng vùng new con lại có một vùng new cha bên trong
		// Mục tiêu ý nghĩa: Phục hồi lại mọi thứ của con khi chưa kế thừa, nhận họ
		// đáp ứng 2 mục tiêu
		// -Làm được những việc như khi đứng một mình.
		// Và không cần làm lại những điều người khác đã làm tốt
		// Object con nhìn sâu sẽ là:
		// Square s1 = new Square();
		//			  new Rectangle();
		// Code của phần riêng con là phần riêng hẳn, override của riêng con
		// => con chỉ là vùng new cha + code của riêng con 
		//					super
		//				di chuyền		biến dị extends
		//				inheritance
		// cha là abstract thì Con sẽ ra sao; y chang ở trên
		// Con chỉ có new cha + code riêng của con
		//			super	//toàn bộ các hàm abstract của cha phải có code 
		//		abstract method// làm gì khác nữa thì cha không quan tâm
		// nếu cha là abstract :
		// new cha + code cho abstract của cha, thế là xong
		// nếu tạo riêng 1 class con ví dụ => tạo Rectangle, disk chả có gì để nói
		// nhưng mình lại không muốn tạo class sẵn có explicit(xác định, cụ thể)
		//
		// Mình chơi bẩn: áp dụng công thức new cha + code cho cha, nhưng lại không tạo class
		// anonymours// mượn gió bẻ măng. mượn Shape tạo object
		
		//	Shape x = new Shape();
		// trong class ??? này phải implement tất cả các code
		// Mình làm biếng tạo thì mình phải code thôi chứ sao (code ở đâu trong khi class k tạo)
		// nếu muốn có object thì phải new.
		// cuối cùng thì ta vẫn chưa đặt tên cho class của object đó => anonymours
		// Vậy vùng to này đại diện cho một class nào đó mà mình lười đặt tên, muốn tạo ở đâu điền code ở đó
		// Vùng này khỏi đặt tên, khỏi tạo khuôn lẻ
		Shape xxx = new Shape("Hình đó đó","màu da"){
			// chỗ này là không gian tạo class lẻ
			// Rectangle, Square, Disk và inner class là khuôn trong khuôn
			// => bất thường, không nhân bản được, không có công thức cụ thể
			// Mua một sấp chén minh long, mua ở siêu thị chén nào cũng giống chén nào.
			// Mua một sấp chén của bầu Trúc
			// return một con số ngẫu nhiên đại diện cho một việc ngẫu nhiên
			@Override
			public double getAre() {
				// Cái gì mà tạo ra 1 cái ngẫu nhiên
				// Gọi là máy ngẫu nhiên, class ngẫu nhiên
				Random rd = new Random();
				return rd.nextDouble()*50;
			}

			@Override
			public double getPerimeter() {
				return new Random().nextDouble();
			}

			@Override
			public void paint() {
				System.out.printf("???       |%-10s|%-10s|%16.2f|%6.2f\n", name, color, getAre(), getPerimeter());
				
			}};
			xxx.paint();
	}
	// Vùng nhớ của anonymurs này lớn hơn vùng nhớ của Shape
	// Kĩ thuật vừa tạo class vừa new luôn trên cùng một lệnh gọi là anonymours class
	// inplecit làm cho tường minh, xác thực một dạng class lồng trong class, nested class, inner class.
	// Khi nào sài kĩ thuật này:
	// 1. Khi tạo object mà không muốn tạo class(chỉ sài 1 lần rồi vức).
	// cái giá: chỉ viết đc 1 lần thôi, và phải viết lại code mỗi lần sài.
	// làm GUI (app đồ họa, giao diện người dùng, xử lí event click, nút bấm check box, bàn phím).
	// lớp sau kì 3 sẽ học.
	// Ví dụ thực tế và ano class: 
	// 
	// đi ăn đám cưới, nhà hàng nới cô dâu chú rể tổ chức
	// Thực_Khách Điệp = new Thực_Khách();
	// Thực_Khách{
	//		mặc đẹp
	//		đưa thiệp
	//		ăn
	//		truyền đau khổ
	//}
	//
	//
	// Ăn_Trực_Khách Trọng  = new Thực_Khách(){
	//			ăn mặc tươm tất
	//			đưa thiệp("Sorry nhen, mốt đến lượt mình chỉ cần đưa lại cái này cho mình hoy")
	//			ăn
	//}
	// cướp ngân hàng
	// câu hỏi hack não nếu trong con ngoài hàm cha mà có hàm riêng thì cha có sài được không?
	// => về mặt là ko, drift và đây là một kĩ thuật nâng cao (tổ lái)
	// kĩ thuật Reflaction(); soi rương - khó - lục lọi vùng ram lúc runtime
	// anonymours giống như chế một object nhưng làm bằng tay, không hề có khuôn nhân bản hàng loạt mà làm tay thì 
	// mỗi lần làm nó ra khác nhau không giống 100% như khuôn được.
	
	
	// Vip anonymour
	// Chơi trò on the go, take away, vừa tạo class code sẵn vừa new
	// Không nhân bản hàng loạt được, lội qua nhnah
	// Bé na cắt một hình gì đó đó, bé na không gọi được tên vì ko biết nhóm nào.
	// Dư giấy vl, cắt chơi vài hình có thể tính S nhưng khó tính 
}
