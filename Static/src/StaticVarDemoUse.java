
public class StaticVarDemoUse {
    public static void main(String[] args){
        StaticVarDemo obj1 = new StaticVarDemo(5,7);
        StaticVarDemo obj2 = new StaticVarDemo(4,6);
        obj1.output();
        obj2.output();
        obj1.setN(9999);
        obj1.output();
        obj2.output();
        System.out.println(StaticVarDemo.N);
    }
}
