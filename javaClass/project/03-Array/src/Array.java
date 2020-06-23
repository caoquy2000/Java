
public class Array {
	public static void main(String[] args) {
		//tạo mảng chứa các số int 10 số
		
		int arrayInt[] = new int[10];
		//mảng này là mảng cố định không co giản về kích thước
		//
		int arrayInt2[] = {1,2,3,4,5,6};
						 //0,1,2,3,4,5
		//arrayInt2 sẽ có size là 6;
		//
		for(int i  = 0; i<= arrayInt2.length - 1; i++) {
			System.out.printf("%5d",arrayInt2[i]);
		}
	}
}
