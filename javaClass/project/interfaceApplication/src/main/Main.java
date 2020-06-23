package main;

import data.Student;
import util.Filter;

/**
*
* @author giao-lang | fb/giao.lang.bis | fb/doit.now.oha
* version 20.0330
*/


//Ví dụ dưới đây sử dụng mảng sinh viên để quen thuộc với mọi người
//Các bạn có thể thay thế bằng collection (List-ArrayList,Set-HashSet) mà không khiến tư duy logic của 
//bài toán bị thay đổi
//Ta đang bàn về tính ứng dụng của bài toán interface, các hàm thống nhất với nhau về tên gọi, hàm và cách
//sử dụng và triệu gọi hàm
//Sau đó linh hoạt trong cách cài đặt, sử dụng và mở rộng, tổng quát hóa trong việc phối hợp lẫn nhau
//đặt ra tiếng nói chung cho 1 thể thống nhất, đó chính là ý nghĩa của interface
//bài toán này mô phỏng lệnh sql seclect * from Student where điều kiện lọc sinh viên
//Dùng interface để linh hoạt cài đặt điều kiện lọc cho mỗi lần lọc khác nhau
public class Main {
	public static void main(String[] args) {
//		Student array[] = new Student[10];
		Student list[] = initStudentList(); //init
		
//		lọc sv có điểm GPA lớn hơn hoặc bằng 8 đó chính là thằng filterGPA đã cài đặt hàm check
//		FilterGPA thì cũng là một dạng class con của class cha filter.
		Filter whereGPA8 = new FilterByGpa();
		
		selectStudents(list,whereGPA8);
//		Hàm select student sẽ nhờ whereGPA8 xét từng cháu sinh viên trong mảng có phải check lớn hơn hoặc bằng 
//		tám k, thỏa thì in ra
//		Hàm selectStudent biết trước rằng whereGPA8 cũng sẽ có hàm check do đã thống nhất rằng hàm selectStudent
//		sẽ chơi với bất kì đứa nào miễn là con của filter
//		Bạn sẽ thấy câu chuyện này rất giống với ý tưởng Collections.sort(list,Comparator) 
//		Collections.sort(list) gọi là comparable
//		Thế nào thì thằng sort cũng biết chắc rằng tham số đưa vào sẽ có hàm compe hoặc compe to 
//		cứ thế mà ung dung nhận  kết quả và làm việc nó được giao, y chang hàm selectStudent
//		Interface được gọi là hội nhóm thống nhất trước, gài trước hàm check để cho những thằng khác gọi tên.
//		Anonymours hoặc cú pháp lambda cho các điều kiện filter khác, ví dụ lọc sinh viên trong khoảng nào đó
//		cho trước, lúc này bạn không cần tạo class rời x là con của filter vì ta chỉ cần chỗ để implement các hàm
//		abstract mà thôi giống như các hàm abstract
//		Riêng về interface chỉ có 1 hàm abstract được gọi là functionalInterface mà khi đó anonymours sẽ 
//		được thay bằng cú pháp lambda chỉ áp dụng cho interface có duy nhất 1 hàm abstract.
		
	}

	public static void selectStudents(Student list[] , Filter whereCondition) {
		if(list.length == 0) {
			System.out.println("this lis is empty, nothing to filter");
			return;
		}
		System.out.println("the student list after filtering");
		for (Student x : list) {
			if(whereCondition.check(x)) x.showProfile();
		}
		//T sử lí danh sách sinh viên theo cách tụi m đưa vào.
//		T thống nhất giao tiếp với bên ngoài theo tiêu chuẩn của filter do bên ngoài đưa vào hàm check
//		Hàm check đưa vào t chỉ lọc dùm danh sách sinh viên theo check bổ sung thêm biến flag để thông báo
//		nếu không có sinh viên nào thỏa bộ lọc
		
	}
	
	//khỡi tạp 10 sv Student khá nahu, làm nguồn cho hàm khác
	//có thể xài ArrayList cũng cùng nguyên tắc
	public static Student[] initStudentList() {
		Student list[] = new Student[10];
		list[0] = new Student("SE01","Một",1991,1.0);
		list[1] = new Student("SE02","Hai",1992,2.0);
		list[2] = new Student("SE03","Ba",1993,3.0);
		list[3] = new Student("SE04","Bốn",1994,4.0);
		list[4] = new Student("SE05","Năm",1995,5.0);
		list[5] = new Student("SE06","Sáu",1996,6.0);
		list[6] = new Student("SE07","Bảy",1997,7.0);
		list[7] = new Student("SE08","Tám",1998,8.0);
		list[8] = new Student("SE09","Chính",1999,9.0);
		list[9] = new Student("SE10","Mười",2000,10.0);
		return list;
	}
}
