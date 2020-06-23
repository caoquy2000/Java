
public class Primitive {
	public static void main(String[] args) {
		/*primitive data type: data nguyên thủy
		 * byte  1byte
		 * short 2byte
		 * int - 4byte
		 * long- 8byte
		 * float-4byte
		 * double-8byte
		 * char-2byte
		 * 8-boolean (true/false) 1bit
		 * 
		 * Mọi 1 primitive lại có những thằng anh cả khác,
		 * thằng anh cả này sẽ bao bọc thằng em (trai bao)
		 * nó chính là Wrapper Class
		 * 
		 * Lưu ý: khi nói đến giá trị mặc định (default value)
		 * ở C thì nó lưu rác
		 * ở java thì là 0 đối với char và số
		 * là false đối với boolean
		 * */
		
		/*Object DataType: được tạo ra gồm nhiều primitive dataType 
		 * đùng để nêu lên 1 đặc điểm của object
		 * ví dụ Student chính là 1 object data Type
		 * name, yob, point
		 * 
		 * */
		char c = 65;
		System.out.println("c = " + c);
		//ta có byte là kiểu dử liệu mới
		//nó là int nhưng bé hơn , lưu ít hơn
		byte numberByte = 90;
		System.out.println("numberByte = "+ numberByte);
//		numberByte = 128;
//		byte chỉ hổ trợ tới 127 thôi, k hổ trợ hơn
		int numberInt = 12345;
		float numberFloat = 3.14f;
		double numberDouble = 3.14;
//		long numberLong = 10000000001l;
		long numberLong = 10_000_000_001l;
		
		numberInt = numberByte;
//		numberByte = numberInt; // chết
		
		
		int n4 = 0xFA;
		System.out.println("n4 = "+ n4);
//		hệ 16 0x
		int n5 = 077;
//		hệ 8
		System.out.println("n5 = "+ n5);
	}
}
