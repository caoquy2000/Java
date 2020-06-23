import java.util.StringTokenizer;

public class StringHacking {
	public static void main(String[] args) {
		String str1 = new String("Do it now string");
//		khởi tạo ra string 2 tham chiếu tới vùng nhớ string 1
		String str2 = str1;
//		String là immutable, bất kì thao tác nào trên string đều tạo ra 1 đối tượng mới
		str1 = str1.concat("-second");
		//str1.concat("-second"); dang9 tao5 vung nho moi co con dia chi
		//lúc này trả về một đối tượng mới có giá trị là Do it now string-second
//		nên cần phải hứng lấy giá trị
//		vẫn đi theo thứ tự sequences/async await
//		xử lí bất đồng bộ
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);

		/*StringBuilder va StringBuffer là mutible class, có nghĩa là chuỗi lưu trong 
		 * 2 object này có thể được sửa đổi thông qua hàm nội tại 
		 * VD: */
		StringBuilder msg1 = new StringBuilder("Do It Now String builder");
		StringBuilder msg2 = msg1;
		//promise/Synchronous 
		//xử lí đồng bộ, dưới đổi thì trên cũng ăn theo mà đổi
		msg1.append("-Second");
		System.out.println("msg1: "+msg1);
		System.out.println("msg2: "+msg2);
//		lúc này chỉnh sửa trên object, và không tạo vùng new mới
		/*StringTokenizer*/
		String information = new String("SE13029|LeHoDiep|1999|10");
		StringTokenizer st = new StringTokenizer(information,"|");
		System.out.println("All of element after splitting");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.countTokens());
		System.out.println(information);
//		nếu có 1 object mà không có hàm toString, thì có thể chơi trò in trực tiếp tên biến
		
		str1.equals(str1);//true/false co1 phan6 biet hoa thuong
		str1.equalsIgnoreCase(str2);//cũng trả về true ỏ false // k quan tâm hoa thường
		str1.compareTo(str2);//-1 0 1
		str1.compareToIgnoreCase(str2);
		//str1 - str2 = 1
		/*StringTokenizer*///hash function
		
//		playWithStringComparison();
		chamVoCuc();
	}
	
	public static void playWithStringComparison() {
		String s0 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");//vùng ram stack
		String s1 = "BÉ HỨA HỌC HÀNH CHĂM NGOAN";//pool
		String s2 = "BÉ HỨA HỌC HÀNH CHĂM NGOAN";
		String s3 = "bé hứa học hành chăm ngoan";
		String s4 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
		String s5 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
		String s6 = new String("BÉ HỨA HỌC HÀNH CHĂM NGOAN");
//		s1 và s0 không bằng nhau vì s0 được tạo trên vùng ram heap stack còn 
//		s1 được tạo bằng kĩ thuật pool
//		không dùng kĩ thuật new
//		s2 va s1 đều được tạo ra trên pool
//		pool sẽ so sánh hoa và thường
		if(s5 == s6) {
			System.out.println("2 thang bang nhau");
		}else {
			System.out.println("2 thang khong bang nhau");
		}
		
	}
	public static void chamVoCuc() {
		String msg = "Xin chào ngày mới";
//		pool thực ra là đang new string ngầm, chắc chắn là có vùng new string
		String msgU = msg.toUpperCase(); //new String("XIN CHÀO NGÀY MỚI") //
		//return về địa chỉ của chuỗi hoa
//		msgU mới đổi thành chữ hoa còn msg thì không đổi thành gì hết
//		immutable 
//		định luật bắt cầu
		//trả về 1 chuỗi(new String(HOA));
		System.out.println("msgU = "+ msgU+"; msg = "+ msg);
//		msgU bằng msg.toUppercase();
//		msgU = msg.toUpperCase().toLowerCase().toUpperCase();
//		mỗi lần gọi hàm sẽ trả về một chuỗi mới
		msg.toUpperCase().charAt(0);
		//object mới chấm được
		//ký tự thì k
		//nên làm như câu trên mà cố tình chấm cho nhiều thì thua
		//vì nó return ra char chứ k return ra String(object)
	}
}
