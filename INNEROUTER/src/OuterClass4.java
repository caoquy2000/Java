
public class OuterClass4 {
    int x = 1;
    public void M(){
        final int t = 2;
        class Inner{
            int y = 3;
            void printf(){
                System.out.println(y+x+t);
            }
        }
        Inner objInner = new Inner();
        objInner.printf();
    }
    public static void main(String[] args){
        OuterClass4 obj = new OuterClass4();
        obj.M();
    }
}
