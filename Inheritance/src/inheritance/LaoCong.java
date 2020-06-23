
package inheritance;


public class LaoCong extends NhanVien {
    public double soGioLamViec;

    public LaoCong(String hoTen,double soGioLamViec, double luong) {
        super(hoTen, luong);
        this.soGioLamViec = soGioLamViec;
    }
    @Override
    public double getThuNhap(){
        return luong * soGioLamViec * 0.1;
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println(">> Số giờ làm việc: "+ this.soGioLamViec);
    }
}
