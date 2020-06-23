
package inheritance;


public class NhanVien {
    public String hoTen;
    public double luong;

    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }
    public double getThuNhap(){
        return this.luong * 0.1;
    }
    public void xuat(){
        System.out.println(">> Ho va ten: "+ this.hoTen);
        System.out.println(">> Luong: "+ this.luong);
        System.out.println(">> Thue thu nhap: "+this.getThuNhap());
    }
}
