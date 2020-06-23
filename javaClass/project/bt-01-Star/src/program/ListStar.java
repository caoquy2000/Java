package program;

import data.Star;

public class ListStar {
	public static void main(String[] args) {
		Star starDs[] = new Star[3];
		Star mtp = new Star("Nguyễn Thanh Tùng", 1994,"Sơn Tùng mtp", "Nắng Ấm Xa Dần");
//		mtp.showInfo();
		Star chipu = new Star("Nguyễn Thùy Chi", 1993, "ChiPu", "Anh ơi ở lại");
//		chipu.showInfo();
		
		starDs[0] = mtp;
		starDs[1] = chipu;
		starDs[2] = new Star("Cậu vàng", 1975, "Vàng 1 champ", "gáy khét");
		
//		for(int i = 0 ; i <= 2 ; i++) {
//			starDs[i].showInfo();
//		}
		
		starDs[0].setName("Jenny Tùng");
		System.out.println("name mtp is " + starDs[0].getName());
		for (Star o : starDs) {
			o.showInfo();
		}
		
		
	}
}
