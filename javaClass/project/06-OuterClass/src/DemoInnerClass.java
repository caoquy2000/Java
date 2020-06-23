
public class DemoInnerClass {

}
class Father{//outer
	public void Show() {
		Son trong = new Son();
		trong.Display();
	}
	class Son{
		// con đối với cha thì con là inner
		public void Display() {
			System.out.println("I am son");
		}
	}
}
//1
class OngHangXom{//outer
	public void show(){
		Father.Son quy = new Father().new Son();
		quy.Display();
	}
}