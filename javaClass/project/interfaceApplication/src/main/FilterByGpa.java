package main;

import data.Student;
import util.Filter;

//Hội viên này là dạng người chuyên đi đánh giá chơi với sinh viên theo điểm.
//Hắn muốn lọc/chơi/check ai đó điểm trung bình lớn hơn hoặc bằng 8.
//Đúng là sinh viên này -> true. Hàm check sẽ trả về true nếu điểm trung bình lớn hơn hoặc bằng 8.
//Đây là bộ lọc sinh viên có điểm lớn hơn hoặc bằng 8 cũng là bộ lọc của filter.


//Ta có chơi bộ lọc theo kiểu anonymours hoặc cú pháp lambda
//Trong tình huống này, nếu được thì sẽ đỡ phải tạo ra 1 class chỉ có 1 hàm
public class FilterByGpa implements Filter{

	@Override
	public boolean check(Student x) {
		return (x.getGpa() >= 8);
	}
	
}
