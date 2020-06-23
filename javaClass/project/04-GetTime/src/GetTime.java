import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class GetTime {
	public static void main(String[] args) {
		System.currentTimeMillis();
		//object System chứa vô số thông tin của hệ thống
//		nên ta chọn nó để lấy ra thời gian hiện hành
//		của server(máy tính của ta)
//		trả về cho ta millisecond;
//		và kiểu giá trị này rất lớn nên ta sẽ lưu bằng 1 biến long

		
//		long start = System.currentTimeMillis();
//		System.out.println(start);
//		
//		for(int i = 0; i<= 100000; i++) {
//			int result = i + i^2;
//			i--;
//			i++;
//		}
//		
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = new Date();
		String day = dateFormat.format(date);
		System.out.println(day);
	}
}
