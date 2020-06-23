import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Demo {
	public static void main(String[] args) {
//		playWithInteger();
//		sortInteger();
//		swapInsideList();
		playWithSet();
	}
	public static void playWithInteger() {
		int fb1[] = {1,1,2,3,5,8,13,21};
		//Mảng chứa int, mảng bth // Tu gia hạn size
		int fb2[] = new int[8];
		Integer fb3[] = {1,1,2,3,5,8,13,21};
		//Tạo như thế này là boxing
		//vì fb3[0]=1//New ngầm Integer(i)
		//mảng object, mảng con trỏ Integer
		//Rất hao ram vì nó cần Integer(từng cháu 1 = new ngầm)
		// Đều bị giới hạn bởi kích thước, do đó ta xài mảng co giảng về số con trỏ.
		ArrayList<Integer> fb = new ArrayList<Integer>();
//		ArrayList<int> fb = new ArrayList<Integer>();
		//Chỉ bỏ vào class thôi không bỏ vào primitive dataType.
		//fb trỏ vùng new chà bá, y chang fb1,fb2,fb3 trỏ vùng new chà bá, biết trước có 8 biến
		//fb3 quản lí 8 con trỏ integer
		fb.add(new Integer(1));//sau khi new, thì đưa tọa độ vùng new cho fb[0], tao sẽ 
		//cất tọa độ new đó trong con trỏ Integer thứ 0;
		//Sinh ra một con trỏ trong vùng new ArrayList();
		fb.add(1); //tự động boxing giùm bố thành vùng new integer(). thẩy tọa độ vào giỏ, mảng do fb má mì quản lí
		fb.add(2);
		fb.add(3);
		fb.add(5);
		fb.add(8);
		fb.add(13);
		fb.add(21);
		//FIFO
		System.out.println("fb has: " + fb);
		//Cái gì cũng phải trả giá
		//Đối với mảng bình thường thì chấm length
		//ArrayList thì chấm size.
		for(int i = 0; i<=fb.size()-1;i++) {
			System.out.println(fb.get(i)+ " ");
//			trả về con trỏ thứ i, tức là tọa độ của vùng new Integer() thứ i 
//			fb[i]. chấm tiếp được, mảng con trỏ, mảng object từng biến mảng/ từng phần tử
			// là con trỏ, trỏ vùng new mà, trỏ được chấm được
			//mảng int[] éo cso à nghen, xài [] luôn value.
			//Biến tọa độ đó, ngầm sẽ gọi toString của vùng new.
		}
		for (Integer integer : fb) {
			System.out.println(integer);
		}
	
	}
	public static void sortInteger() {
		ArrayList<Integer> ds = new ArrayList();
//		ArrayList ds2 = new ArrayList();
//		giỏ đa năng, bỏ con mẹ gì vào cũng được	
//		cái gì hiện đại cũng mau hư, cẩn thận
		List<Integer> ds3 = new ArrayList();
//		List<Integer> ds4 = new List();//Anonymours
		ds.add(5);
		ds.add(8);
		ds.add(4);
		ds.add(2);
		ds.add(9);
		ds.add(2);
		ds.add(0);
		ds.add(11);
//		tui muốn in trước và sort sau
		System.out.println("Trước sort");
		System.out.println(ds);
		Collections.sort(ds);
		Collections.reverse(ds);
		//sort xong r
//		bên trong hàm sort giống như người thợ may buổi tối về phải sửa quần áo
//		theo cách của bạn hướng dẫn họ
//		họ đang theo cái interface mà mình định nghĩa trước. họ theo hoy
//		comparable có khả năng. kẻ gato, 2 đứa tự so sánh.
		System.out.println("Sau sort");
		System.out.println(ds);
//		hack cái não: em muốn sort danh sách sv theo 1 chỉ tiêu nào đó thì sao
//		compartor
		
		
	}
	public static void swapInsideList() {
		List<Integer> ds = new ArrayList();
		ds.add(10000);//Bạn đang new Integer(10000);
		ds.add(50);
		System.out.println(ds);
//		toString là một hàm đặc biệt, nó sẽ tổng hợp data và biến data bên trong object thành 1 dòng text
//		biến thành text để return ra bên ngoài
//		hiệu ứng domino
		
//		System.out.println(); cho biến con trỏ vào thì nó sẽ gọi thầm tên em.
//		List vào thứ tự nào, thì ra thứ tự đó
//		Hash thì vào trước nhưng có thể ra sau
//		lộn xộn thứ tự con trỏ
//		giỏ để lộn xộn
//		tui muốn in ra 50 10000 kìa
//		nhưng vậy thì con trỏ của tui phải là 50 ở index 0; phải trỏ vùng integer 50 à nghen
//		và [1] phải trỏ new integer(10000)
		
		Integer a =	ds.get(0);
		ds.set(0, ds.get(1));//ds.get(0) = ds.get(1); //gán địa chỉ nhảm nhí phải set
		ds.set(1, a);
		System.out.println(ds);
	}
	public static void playWithSet() {
//		set là vỏ đặt biệt trong bộ collection, set này chứa các id dùng để hash function
//		do đó, set là một cái giỏ cấm trùng, không cho phép nhiều hơn 2 con trỏ trong giỏ trỏ trùng tới 1 vùng new
//		không chấp nhận 2 chàng trỏ 1 nàng
		Set<Integer> ds = new HashSet(); 
//		ds.add(1000);
		ds.add(1000);
		ds.add(-500);
		ds.add(2000);
		ds.add(2020);
		
//		không đi theo nguyên tác FIFO 
//		thằng này thì ra lộn xộn không theo thứ tự nên nó không có hàm get
//		nếu nhập trùng code vẫn chạy nhưng chỉ lấy 1 cái thôi
		
		System.out.println("Set: "+ds);
		
//		Hashset và equal là cặp bày  trùng
//		nó dính đến khái niệm object bằng nhau, trùng nhau giúp mình điều khiển thằng set khi lưu trữ object do mình tạo ra (student,integer,string,class có sẵn mình sài)
//		map là giỏ cập ánh xạ. tức là bỏ chỗ nào thì phải thêm nhận dạng
//		tại sao map nằm riêng: map là giỏ ánh xạ bỏ chó vào thì phải thêm nhận dạng
//		collection là bộ sưu tập chứa nhiều con trỏ, list, set chỉ  chứa một lại trỏ để bỏ vào thôi, nhiều theo đơn
//		map đòi đến 2 con trỏ, con trỏ nhận dạng vùng new và con trỏ nhận dạng con trỏ => ánh xạ theo nhiều cách
	
	
	
	
	}
	
	
	
}

