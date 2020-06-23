
package inheritance;


public class TruongPHong extends NhanVien{
    public double trachNhiem;

    public TruongPHong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println(">> Trach nhiem: "+trachNhiem);
    }
    
}
