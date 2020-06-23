package runtime;

import data.Star;

public class demo {
	public static void main(String[] args) {
		Star mtp = new Star("Son Tung MTP", 1993, "Nam");
		mtp.showInfor();
		Star nt  =new Star("Ngoc Trinh", 1991, "Nu");
		nt.showInfor();
		mtp.showInfor();
		Star vkt = new Star("Vu khac tiep", 1987, "Nam");
		vkt.showInfor();
		
		//Moi nguoi len bo
		System.out.println("Moi nguoi len bo");
		mtp.showInfor();
		nt.showInfor();
		vkt.showInfor();
		// Day chinh la hien tuong static tren thuoc tinh -> Bất đồng bộ
	}
}
