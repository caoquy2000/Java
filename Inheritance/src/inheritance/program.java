
package inheritance;


public class program {
    public static void main(String[] args){
        NhanVien nv1 = new NhanVien("Quốc",100);
        nv1.xuat();
        System.out.println("\n");
        TruongPHong nv2 = new TruongPHong("Nam",100,200);
        nv2.xuat();
        System.out.println("\n");
        LaoCong nv3 = new LaoCong("Trường",10,200);
        nv3.xuat();
    }
}
