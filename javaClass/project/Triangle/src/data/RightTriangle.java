package data;


	public class RightTriangle extends Triangle{

		public RightTriangle(String name, String color,double firstSide, double secondSide, double thirdSide) {
			super(name, color, firstSide, secondSide, thirdSide);
		}
		
		@Override
		public void ShowInfor() {
			System.out.printf("\n|RightTriangle|%-15s|%-15s|%6.2f|%6.2f|%6.2f|%6.2f|%6.2f",name,color,firstSide,secondSide,thirdSide,computeArea(),computePerimeter());
		}	
	}
