
public class DemoString {
	public static void main(String[] args) {
//		String chuỗi kí tự
//		char[5] = "hello"
//		String name = "hello" 
//		String là một dãy liên tiếp các kí tự liền kề và sát nhau
//		Ta có thể xem String là một cái mảng
//		Các kí tự liền kề này được gói trong một vùng ram
//		bự chà bá (class). String là 1 wapper class nhưng không chính thống.
//		String là object data type. String là immutible	class vì không chứa hàm setter()//
		
//		Một khi bạn đã tạo ra chuỗi trong vùng ram rồi thì không thể thay đổi giá trị
//		của các kí tự trong chuỗi
//		Muốn thay đổi thì chỉ có thể tạo ra object string mới.
		
//		khai báo:
//		1.Chuẩn oop
		String s1 = new String("Quy đẹp trai");
//		2.Dùng chuỗi giá trị cho trước/ gán vào trực tiếp mà không dùng new, gọi là dùng String literal
//		và tình huống này gọi là String Pool 
		String s2 = "Quy đẹp trai";
//		String Pool: khi khai báo và gán giá trị cho biến bằng kĩ thuật literal(gán trực tiếp) - không gán qua toán tử new.
//		đó là lúc chuỗi được lưu vào một vùng nhớ chung gọi là pool
		
		
		
	}
}
