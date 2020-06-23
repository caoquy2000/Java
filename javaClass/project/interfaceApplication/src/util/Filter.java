package util;

import data.Student;

//Phiên bản 1: Không sài generic chỉ sài filter bộ lọc với student
//Hội filter (Interface class cha) là hội tập hợp những kẻ hội viên mà trong số chúng thíc
//đi đánh giá và xét nét các sinh viên
//Ta là bộ lọc -  cha của các bộ lọc khác nhau trên cuộc đời.
//Lọc theo điểm, lọc theo năm sinh, lọc theo xếp hạng xét cho cùng thì đều là bộ lọc
//Ta chỉ nói chung vậy thôi, còn mỗi đứa lọc như thế nào thì nó tự làm-bộ lọc cụ thể thì phải implement t đã
//Hội này có quy tắc, quy ước (abstract) là:
//Sẽ đánh giá/ check một sinh viên x nào đó và trả ra kết là true or false
//Nhấn mạnh rằng hội filter chỉ nói là sẽ đánh giá/check sinh viên x trả về true or false thôi
//Còn cách đánh giá chi tiết thế nào thì phải tùy vào mỗi hội viên (class con)
//Tùy theo mỗi hội viên

//ví dụ có hội viên SinhNamChan thì sẽ thích đánh giá SinhVien (implement hàm check())
//theo tiêu chí là chấp nhận những bạn sv x vó năm sinh chẵn (chia hết cho 2)

//ví dụ có hội viên diemlonhon8 thì sẽ thích cách đánh giá sinh viên (implement hàm check())
// theo tiêu chí là chấp nhận những bạn sv x có điểm gpa >= 8


public interface Filter {
	public boolean check(Student x);	
}
//trả về true/false tùy cách mình đánh giá 1 sinh viên x
//theo tieu chí chuẩn nào đó do hội viên đưa ra
//Các class có quyền viết hàm check trả về true or false theo cách riêng của con.
//Ví dụ trả về true nếu sinh viên có điểm lớn hơn 8.
