
public class IfElse {
	public static void main(String[] args) {
		//&& và &
		
		int a = 0;
		int b = 5;
		
		if(b-- < 10 && a++ > 10) {
			System.out.println("trên a = "+a +",b = "+ b);
		}else {
			System.out.println("dưới a = "+a +",b = "+ b);
		}
		if( a++ > 10 & b-- < 10) {
			System.out.println("trên a = "+a +",b = "+ b);
		}else {
			System.out.println("dưới a = "+a +",b = "+ b);
		}
		
		//|| và |
		if(b-- < 10 | a++ > 10 ) {
			System.out.println("trên a = "+a +",b = "+ b);
		}else {
			System.out.println("dưới a = "+a +",b = "+ b);
		}
	}
}
