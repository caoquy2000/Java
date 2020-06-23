
public class Bike {
    void run(){
        System.out.println("Dang chay");
    }
}
class Splender extends Bike{
    @Override
    void run(){
        System.out.println("Chay 60km");
    }
    public static void main(String args[]){
        Bike b = new Splender();
        b.run();
    }
}
