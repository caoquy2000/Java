package data;
//Nếu đua mà chỉ quan tâm đến đua hoy, chỉ quan tâm đến tăng
//tốc và về đích không quan tâm đến an toàn
//=>1 đua thủ/ anh hùng xa lộ
//Nếu là deadracer thì hành động chính của mày đua tới chết
//Cat is kind of deadracer
//moto là 1 dạng đua thủ
//vậy thì có chung 1 điểm là đua
//nhưng mà mỗi đứa khác nhau sẽ dựa trên các class khác nhau
//và có cách đua khác nhau
//Thằng môto đua là phải tháo thắng ra, cà chân chống ,dạt 
//mình, tung mình trên xe.
// Dog chạy bạt mạng
// Tóm lại hình thức đua xe sẽ khác nhau => Đây là một abstract method
//Giống như đua xe ngoài đời, hay đá banh có chiến thuật khác nhau.
//Chiến thuật là abstract method
// Interface là 1 class cha chỉ quan tâm đến hành động, hành động là abstract.


public interface DeadRacer {
	/*Mình tham gia câu lạc bộ từ tứ phương, miễn cùng sở thích 
	 * là chung 1 team nên k cần đặc điểm gì hết.
	 * VD: Đường Phạm Văn Đồng, vừa đi vừa nẹc bô và nhìn trước ngó sau.
	 * Mẹ kiếp thằng phía sau ngứa tay, hai thằng cùng gáy thế là đua.
	 * Không ai quan tâm là mày học ở đâu, chỉ cần m thích nẹt bô, đua xe
	 * t thích đua xe nẹt bô là chúng mình đua xe.
	 * Vậy ta không cần đặc điểm nào cả
	 * interface (Giao tiếp, hàm ý chung, tiếng nói, ý tưởng, không quan tâm đặc điểm.)
	 * Chung ý tưởng, yêu nước => vào đảng.
	 * Nếu cố tình có đặc điểm
	 * Private String name;
	 * illegal modifier
	 * 
	 * Muốn có thuộc tính thì phải là public static final
	 * và biến đó phải có sẵn value
	 * Điều này nhấn mạnh đến vấn đề giao tiếp.
	 * 
	 * */
	String DEADRACERDATE = "Ngày đua cũng là ngày giỗ";
	//Có thể ghi public (static final đã được ghi sẵn), bàn về những cái chung cùng hưởng.
	//Nếu thuộc tính có sẵn value rồi thì cần méo gì constructor
	//=>>> Interface thì méo có constructor
	//Méo cần constructor
	//Nếu cố tình tạo thì sẽ bị void thì bắc buộc phải có body
	//Cac đặc điểm mặc định sẽ là public static final có sẵn value
	//Các hàm bên trong toàn là abstract
	//public interface xyz sẽ khá tương đương với public abstract class
	//Khác nhau abstract class có thuộc tính và có constructor còn interface chỉ có hằng số và không có constructor
	//Interface chính là mức độ khó nhất của lập trình OOP.
	//Bởi vì không cần sài abstract lúc khai báo hành động.nên các hàm có code thì phải là static và đôi khi là đi kèm default nếu không có static thì mới được quyền có code.
	
	//Tại sao vậy
	//Nó sẽ bàn về tính tương thích của interface.
	
	public double runToDead();
	//Không cần từ khóa abstract ở trong interface
	//Vì mặc định ai cũng biết nó là abstract hết.
	public void showToQuocGhiCong();
	//đua đến chết thì tổ quốc ghi công
	//và bia mộ cũng khác nhau về kích thước, to nhỏ không đều / abstract 
	
	//Moto là 1 racer, new moto chắc chắn cũng là new racer.
	//Mặc định mỗi class trong java nếu không có constructor và phễu thì jvm sẽ tạo ra 1 constructor rỗng
	//Nhưng nếu bạn đã tạo sẵn 1 constructor nào đó rồi jvm sẽ k tạo ra constructor default
	//Bạn có thể thêm rõ ràng constructor này nếu muốn.
	//Một class bất kì thì có nhiều constructor và => cái này được gọi là overload
	//Ngoài đời một class bất kì đều có thể có nhiều constructor tương ứng với nhiều cách đúc khác nhau.
	//1 class bất kì có nhiều constructor -> cũng đượcgọi là overload.
	//khuôn chứa gì đó hoặc k chứa gì đó (vô k ruột, có hình nhưng k có chất) được mảng là default value (bolean: true, false, 0 ,null)
	//Lát hồi mình sẽ set ??? để vào default value này.
	//Có bao nhiêu constructor thì có bấy nhiêu cách đúc(new).
	//đúc tường dở 1/2 thân thôi, thiếu tay được.
}
