public class Unit23{
    public static void main(String[] args){
        Outer out = new Outer();
        out.show();
    }
}
class Outer{
    public void show(){
        Inner in = new Inner();
        in.display();
    }
    class Inner{
        public void display(){
            System.out.println("I AM INNER CLASS");
        }
    }
}
