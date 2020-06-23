package data;

public class Rectangle {
	String hcn;
	int chieuDai;
	int chieuRong;
	int area;
	int chuVi;
	public Rectangle(String hcn,int chieuDai, int chieuRong) {
		this.hcn = hcn;
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public String getName() {
		return hcn;
	}
	public void DienTich(){
		this.area = chieuDai * chieuRong;
		System.out.println("HCN : "+ hcn + " Chieu Dai la: " + chieuDai +" Chieu Rong la: "+ chieuRong + " Co Dien Tich La: " + area);
	}
	public void ChuVi() {
		this.chuVi = (chieuDai + chieuRong)*2;
		System.out.println("HCN : "+ hcn + " Chieu Dai la: " + chieuDai +" Chieu Rong la: "+ chieuRong + " Co Chu Vi La: " + chuVi);
	}
	public int tinhChuVi() {
		return this.chuVi = (chieuDai + chieuRong)*2;
	}
	public int computeArea() {
		return this.area = chieuDai * chieuRong;
	}
	
	public void ShowHCN() {
		System.out.println("HCN : "+ hcn + " Chieu Dai la " + chieuDai +" Chieu Rong la "+ chieuRong);
	}
}
