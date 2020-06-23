package program;

import data.*;


public class RectangleRun {
	public static void main(String[] args) {
		Rectangle tia = new Rectangle("Tía tím", "tím mộng mơ",3,2);
		Rectangle listRectangle[] = new Rectangle[3];
		listRectangle[0] = tia;
		listRectangle[1] = new Rectangle("má", "hồng", 4,2);
//		listRectangle[2] = new Rectangle("con giai", "đỏ đô", 2, 2);
		Square conGiai = new Square("con trai trời", "dishornor",2);
//		conGiai.showInfor();
		listRectangle[2] = conGiai;
		
		for(int i = 0; i<= listRectangle.length - 1; i++) {
			listRectangle[i].showInfor();
		}
		//vì list này là list chứa các Rectangle , mà các rectangle thì k chơi chung với
		//Square=> nên không giao tiếp với nhau
		//phải làm sao đó mà có giấy khai sinh cho thằng Rectangle biết rằng thằng Square chính là con của nó
		
	
		//Triangle đi ngang qua cái nhà này, nhìn vô cái nhà bạc tỷ, thấy đang lục đục chuyện cha con cãi nhau vì 
		//kế thừa, và huyết thống
		//cảm thấy bản thân cũng có cái gì đó 
		//rất chi là giống(name, color, width, computeArea(), computePerimeter(), showInfor)
		//tự tin vô nhận cha :)))
		//lúc này bố con nhà Rectangle hết sức ngạc nhiên.
		//
	}
}
