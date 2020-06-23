package program;

import data.Rectangle;

public class ListRectangle {
	public static void main(String[] args) {
		Rectangle rectangleDs[] = new Rectangle[5];
		rectangleDs[0] = new Rectangle("ABCD",7,5);
		rectangleDs[1] = new Rectangle("ABCE",8,5);
		rectangleDs[2] = new Rectangle("ABCF",9,3);
		rectangleDs[3] = new Rectangle("EFGN",7,4);
		rectangleDs[4] = new Rectangle("UHND",4,2);
//		for (Rectangle o : rectangleDs) {
//			o.ShowHCN();
//		}
//		for (Rectangle h : rectangleDs) {
//			h.DienTich();
//		}
//		for (Rectangle c : rectangleDs) {
//			c.ChuVi();
//		}
//		System.out.println("HCN: "+rectangleDs[0].getName() +" Co Chu Vi la: "+ rectangleDs[0].tinhChuVi());
//		System.out.println("HCN: "+rectangleDs[0].getName() +" Co Dien Tich la: "+ rectangleDs[0].computeArea());

	}
}
