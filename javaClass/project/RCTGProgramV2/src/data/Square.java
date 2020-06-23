package data;
//trước khi muốn xác nhập mối quan hệ cha con thì phải biết được các nhân tử chung của cả 2
//để gom nhóm bỏ vào thằng cha
//sau đó thằng con chỉ việc kế thừa phần đó thôi
//những gì của riêng con là của riêng con
//cha không có
//=>bất hiểu
//=> tính chất bất hiếu trong quan hệ cha con
//Is a(1 chiều)
//tính chất đơn kế thừa
public class Square extends Rectangle{

	public Square(String name, String color,double width) {
		super(name, color, width, width);
		//gọi constructor của Rectangle và hứng các parameter của Square
		//em đang tạo 1 new Rectangle
	}
	
	@Override
	public void showInfor() {
		System.out.printf("\n|Sqare    			|%-15s|%-15s|%6.2f|%6.2f|%6.2f|%6.2f",name,color,length,width,computeArea(),computePerimeter());
	}
	
	//Override: bao lên, bộc lên, độ lên, vượt mặt, qua mặt
	//Override chỉ xuất hiện khi mà thằng con muốn vượt mặt thằng cha mà thôi
	//là viết đè lên method của thằng cha
	//cùng tên nhưng khác class(2 class đó lại có mối quan hệ is a)
	
}
