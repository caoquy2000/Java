
public class StaticVarDemo {
    static int N = 10;
    int x, y;
    public StaticVarDemo (int xx, int yy){
        x = xx;
        y = yy;
    }
    public void setN(int nn){
        N = nn;
    }
    public void output(){
        System.out.println(N + "," + x + "," + y);
    }
}
