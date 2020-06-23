package runtime;

import java.util.Random;

import data.Cat;
import data.DeadRacer;
import data.Dog;
//import data.Hamter;
import data.Motor;
import data.Pet;

public class AmazingRace {
	public static void main(String[] args) {
		//đường đua bắt đầu
		Pet d1 = new Dog("Cậu Vàng",1950,10.0);
		Pet d2 = new Dog("Bê Tô", 2010,8.0);	//NNA
		Cat c1 = new Cat("KITTY", 1980,0,"ZUI");
//		Pet h1 = new Hamter("MICKEY",1950,4.0);
		Pet racer[] = {d1,d2,c1};
		//có 4 đua thủ/chưa biết là con gì, cứ khải mảng là khai báo biến hoi
		for (Pet o : racer) {
			o.showRecord();
		}
		//bàn riêng về Pet
		//đua trong đem,xuất hiện 1 thằng đen thui dí theo sau
		//con mèo  hay chó hay chuột
		//nhưng mình nhìn thoáng thôi cũng đoán đc con này nho nhỏ thôi
		//
		Pet xxx = new Pet("xxx",2020,0.5) {

			@Override
			public double run() {
				// TODO Auto-generated method stub
				return new Random().nextDouble() * 30;
			}

			@Override
			public void showRecord() {
				// TODO Auto-generated method stub
				System.out.printf("|XXX   |%-15s|%4d|%4.1f|%-5.1f\n",name,yob,weight,run());
			}
		};
		xxx.showRecord();
		Motor ex = new Motor("EXCITER 2K", 2020, 150,"56F8-2204"); //Mai mai khong chet
		Motor win = new Motor("WINNER 19", 2019, 150,"56F8-6789");
		ex.showRecord();
		win.showRecord();
		ex.showToQuocGhiCong();
		DeadRacer racerls[] = new DeadRacer[4];
		racerls[0] = ex;
//		racerls[1] = d1;
		// vì pet k có unimplement đâu pet có phải là deadracer đâu mà đua.
		racerls[1] = (Dog)d1;
		racerls[2] = (Dog)d2;
		
//	racerls[3] = c1;
//	không được vì class cat chưa unimplement cha k có con không có thì làm sao đua được.
//	tất cả đều là racer chung một mảng rồi đó, chỉ quan tâm đến hành động mà thôi.
//	cha hành động interface
		// cha có nhiều thứ con, abstract class.
		//nếu abs này có họ hàng gọi là abs c1
		//nếu ac này có hội nhóm, và chỉ chứa 1 hành động duy nhất thì gọi là interface
		
		
		//Mĩ nhân ngư của CTT năm 2014, class Mermaid MNN mặc định là bắt thủy thủ
		//Chỉ ngồi trên 1 chỗ đá chờ chàng tới sực/ăn
		//MNN CTT lạc loài/k chịu ăn thịt, ăn chay, yêu loài người. thích đua, đua theo cuộc đua này
		//Kỳ thú: Class Mermaid implement DeadRacer vô lý lắm luôn
		// Kỹ thuật anonymours.
		//Tạo ra object cá biệt, không muốn tạo class riêng 
		// mà chỉ muốn dựa trên abstract class đã có hoy
		//tui muốn có racer mà đéo muốn tạo class giống như mĩ nhân như của CTT là 
		//một object muốn đi đua hoy mà ép cả họ nhà cá đi đua hoy là quá đáng lắm.
		//ta có thể anonymours trên interface.
		//Xét cho cùng class nào muốn tham gia hội đua thì chỉ cần có code trong hàm run là đc
		//new cha + viết code cũng đc mà, tạo class riêng làm gì => class vô danh
		// k cần tạo class rõ ràng và tường minh.
		//interface làm méo gì có constructor mà new.
		// lo làm gì bẹn ơi, sài constructor default mặc định lúc f6 sẽ tự sinh ra
		//jvm đã tạo sẵn rồi, chỉ cần lấy chơi hoy
		racerls[3] = new DeadRacer() {

			@Override
			public double runToDead() {
				return new Random().nextDouble()*60*3;
			}

			@Override
			public void showToQuocGhiCong() {
				System.out.printf("\n|MNN CTT    |%-15s|%4d|%-5.2f","MermaidCTT",2014,runToDead());
				
			}
			
		};
		for (DeadRacer o : racerls) {
			o.showToQuocGhiCong();
		}
		
		
		//giờ xe đòi vô rance 
		//nhưng nó quá khác biệt - gọi là interface
	}
}
