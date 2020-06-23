package program;

import data.*;

public class TriangleRun {
	public static void main(String[] args) {
		Triangle listTriangle[] = new Triangle[3]; 
		listTriangle[0] = new Triangle("Tam giác cha","vàng",4,5,7);
		listTriangle[1] = new Triangle("Tam giác mẹ","đỏ",3,5,4);
		listTriangle[2] = new RightTriangle("Tam giác con","hồng",3,4,5);
		for(int i = 0 ; i <= listTriangle.length - 1; i++) {
			listTriangle[i].ShowInfor();
		}
	}
}
