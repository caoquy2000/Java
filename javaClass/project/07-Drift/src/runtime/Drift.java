package runtime;

import data.*;

public class Drift {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle("Pink","hồng",10,23);
//		r1.
		Square s1 = new Square("red","đỏ","<3",4);
//		s1.drawTextTitle();
//		s1. sổ ra tất tần tật những gì của con và của cha, vì nó hiểu rằng 
//		nó được thừa hưởng từ cha.
		Rectangle r2 = new Square ("7color","7 mào","><",3);
//		r2.drawTextTitle();
//		vì mày đang dùng cái danh nghĩa là cha 
//		bản chất object r2 vẩn có đủ hàm của thằng con nhưng méo được xài vì 
//		mang danh nghĩa là cha//chỉ vì con trỏ của bạn ngắn hơn so với vùng nhớ
//		vậy ta phải lết bánh kéo dài con trỏ, kéo dài sợi thun xuống tới đáy để
//		thấy được các hàm riêng của con
//		Drift chính ta mò được tọa độ vùng new của con
		Square tmp = (Square)r2;
//		Bắt r2 phải kéo dài tọa độ xuống tọa độ của Square và gán vào biến Square
//		truyền thống
//		Đây chính là kĩ thuật 2 chàng trỏ 1 nàng
		tmp.drawTextTitle();
//		r2.drawTextTitle();
//		tmp là 1 biến square,  chấm mà không sổ ra hết thì hơi lạ
		
//		Nhưng ép kiểu vẫn chỉ là lấy tọa độ thôi nhưng thực tế thì nó vẫn la Rectangle
//		Sợi thun sau khi co giãn thì mình bỏ tay ra thì nó phải trở lại bình thường.
		 
//		Cũng là kĩ thuật Drift nhưng dưới đây là cách Drift gọn gàng hơn, không sài biến 
//		con trỏ tạm/tên tắc khác mà thôi.
//		Sếp, Sơn Tùng, MTP đều chỉ tới 1 anh chàng tên nguyễn thanh tùng sinh năm 1994
//		Định luật bắt cầu thoy mn oiii.
		((Square)r2).drawTextTitle();
//		Square r3 = new Rectangle("Yellow","tía",5,5);
		
	}
}
//	Trong mối quan hệ cha con có các cách khai báo như sau:
//	1. Khai cha new cha. Nếu cha là abstract thì anonymours à nhen.
//	Sổ ra hết tất cả những gì của cha, của vùng new cha.
//	2. Khai con new con đó là khai gì thì new nấy rất truyền thống.
//	Sổ ra tất cả những gì của cha và của con.
//	3. Khai cha nhưng new con nguyên tắc kế thừa (is a).
//	Chỉ sổ ra những hàm của cha vì là vùng của cha nên sổ ra những hàm của cha, không sổ ra những thằng của con.
//	Khai cha new con bản chất là mượn cái khung của con để đúc thành object của cha.
//	Đúc xong thì vùng new con nằm ở dưới, vùng new cha nằm ở trên.
//	Ta phải Drift khai gian
//	4. Khai con new cha (con đẻ ra trước cha) vô lí vl.
//	Cha là người nâng đỡ, đẻ ra người người con mà lần này con đẻ ra người cha là sai.
