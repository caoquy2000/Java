package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import util.MyToys;

//tủ dung79 hồ sơ các thú cưng, lồng nhốt toàn bộ đám Dog, Cat
//->Viết hết các hàm vào đây, không viết trong main nữa
//Tủ đựng hồ sơ các thú cưng, lồng ghép toàn bộ đám chó và mèo

public class Cabinet {
//	dùng ArrayList là 1 biến thể của mảng, để lưu trữ danh sách
//	hồ sơ các chú pet
//	phiên bản nâng cao dễ sài map
	private ArrayList<Pet> petList = new ArrayList();
	private Scanner scanner = new Scanner(System.in);
	//Bàn phím nhập sài chung cho tất cả.
	
	//----------------------------------
	//Chứa các hành động liên quan đến tủ đồ, tủ hồ sơ
	//----------------------------------
	//Thêm hồ sơ, tìm hồ sơ, xóa hồ sơ, sửa hồ sơ, in danh sách sort.
	
	//Thêm mới hồ sơ của 1 con chó
	public void addNewDog() {
		String id,name;
		int yob;
		double weight;
		int pos;
		do {
//			Mã số con dog là D kèm 5 digits
			id = MyToys.getID("Input ID (DXXXXX): ", "Error", "[D|d]\\d{5}$");
			//id cua may hop le
			pos = searchPetByID(id);
			if(pos >= 0)
				System.out.println("The dog's id is already exitsts." + "Input another one!");
		}while(pos != -1);
		name = MyToys.getString("Input Dog Name: ", "The dog name is required.");
		yob = MyToys.getAnInteger("Input Dog YOB: ", "Error", 2000, 2020);
		weight = MyToys.getADouble("Input Dog Weight: ", "Error", 0.1, 99);
		petList.add(new Dog(id,name,yob,weight));
		System.out.println("A dog profile is added sucessfully.");
	}
	
	public void addNewCat() {
		String id,name;
		int yob;
		double weight;
		int pos;
		do {
//			Mã số con dog là D kèm 5 digits
			id = MyToys.getID("Input ID (CXXXXX): ", "Error", "[C|c]\\d{5}$");
			//id cua may hop le
			pos = searchPetByID(id);
			if(pos >= 0)
				System.out.println("The cat's id is already exitsts." + "Input another one!");
		}while(pos != -1);
		name = MyToys.getString("Input cat Name: ", "The cat name is required.");
		yob = MyToys.getAnInteger("Input Cat YOB: ", "Error", 2000, 2020);
		weight = MyToys.getADouble("Input Cat Weight: ", "Error", 0.1, 99);
		petList.add(new Cat(id,name,yob,weight));
		System.out.println("A Cat profile is added sucessfully.");
	}
	
	//Tìm hồ sơ chó mèo
	//Hàm này được gọi bởi menu từ main để thực thi chức năng tìm thú cưng, yêu cầu nhập id
	//của dog hoặc cat để tìm
	public void searchPetByID() {
		String id;
		Pet x; //Con trỏ tạm thời đến pet cần tìm.
		
		id = MyToys.getString("Input pet id: ", "Pet id is required!!");
		x = searchPetObjectByID(id);
		System.out.println("-------------------------------------------");
		if(x == null) {
			System.out.println("Not found!");
		}
		else { 
			System.out.println("Here is the Pet that you want to search.");
			x.showProfile();
		}
	}
	//Hàm helper/ Hàm phụ trợ
	//Hàm này sẽ trả về 1 giá trị tìm thấy  trong Pet
	//	quy ước rằng 0 k tìm thấy
	//	trả về >= 0 nghĩa là tìm thấy
	public int searchPetByID(String petID) {
		//thuật toán trâu bò, rà quét hết mảng
		//So khớp id của pet thứ i trong mảng cxoi  có bằng id đưa vào không
		int pos;
		if(petList.isEmpty())
			return -1;
		for( int i = 0; i <= petList.size() - 1 ; i++) 
			if(petList.get(i).getId().equalsIgnoreCase(petID))
				return i;
		return -1;
	}
	
	
	//nó có khả năng return ra object.
//	Nếu tìm thấy ta return con trỏ đến pet cần tìm, có 2 biến cùng trỏ vào vùng new pet trước đó.
//	Nếu không tìm được trỏ về NULL
	
	public Pet searchPetObjectByID(String petID) {
		if(petList.isEmpty()) {
			return null;
		}
		for(int i = 0; i <= petList.size() - 1; i++) {
			if(petList.get(i).getId().equalsIgnoreCase(petID)) {
				return petList.get(i);
			}
		}
		return null;
	}
	//Cập nhật thông tin từ pet.
	// Hàm này được gọi bởi menu từ main()
	public void updatePet() {
		String id;
		String tmpName; //Nhap ten moi cho pet.
		Pet x; // con tro tam
		id = MyToys.getString("Input pet id you want to update: ", "Pet id is required!!");
		x = searchPetObjectByID(id);
		System.out.println("---------------------------------------------------");
		if(x == null) {
			System.out.println("Not found!!");
		}else {
			System.out.println("Here is the Pet before updating");
			x.showProfile();
			System.out.println("You are required input a new name: ");
			tmpName = MyToys.getString("Input new name: ", "Name is required!!");
			x.setName(tmpName);
			System.out.println("The Pet info is updated successfully.");
		}
	}
	
	public void RemovePet() {
		String id;
		int pos;
		id = MyToys.getString("Input pet id you want to update: ", "Pet id is required!!");
		pos = searchPetByID(id);
		System.out.println("---------------------------------------------------");
		if(pos == -1) {
			System.out.println("Not found!!");
		}else {
			petList.remove(pos);
			System.out.println("The selected pet is removed successfully");
		}
	}
	
	// In ra man hinh
	//In danh sach cac pet tang dan theo ID. 
	// Mac dinh pet duoc sort tren ID tang dan, dung co che comparable
	//Moi con pet co kha nang gato voi dong loai cua no
	public void printfPetListAscendingByID() {
		if(petList.isEmpty()) {
			System.out.println("Nothing to print");
			return;
		}
		Collections.sort(petList);
		System.out.println("--------------------------------------------------");
		System.out.println("Here is the petList.");
		String header = String.format("|%6s|%15s|%4s|%4.1s|%4.1s", "ID","NAME","YOB","WEIGHT","SPD");
		System.out.println(header);
		for (Pet o : petList) {
			o.showProfile();
		}
	}
	
	public void printfPetListAscendingByName() {
		if(petList.isEmpty()) {
			System.out.println("Nothing to print");
			return;
		}
		Comparator nameBalance = new Comparator<Pet>(){
			@Override
			public int compare(Pet o1, Pet o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};
		Collections.sort(petList, nameBalance);
		System.out.println("--------------------------------------------------");
		System.out.println("Here is the petList.");
		String header = String.format("|%6s|%15s|%4s|%4.1s|%4.1s", "ID","NAME","YOB","WEIGHT","SPD");
		System.out.println(header);
		for (Pet o : petList) {
			o.showProfile();
		}
	}
}


































































