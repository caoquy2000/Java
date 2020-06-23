package data;

import java.awt.BorderLayout;
import java.util.Scanner;

public class PersonList {

    private Person[] list = null;
    private int count = 0; //So nguoi hien tai cua list

    //tao 1 list voi size nguoi.
    public PersonList(int size) {
        if (size < 10) {
            size = 10;  //neu size <10 thi so nguoi toi da trong list se la 10
        }
        list = new Person[size];
    }

    int find(String aCode) {
        for (int i = 0; i < count; i++) {
            if (aCode.equals(list[i].getCode())) {
                return i;//neu parametter aCode = list[i].getcode
            }
        }
        return -1;
    }

    //ham them moi 1 nguoi
    public void add() {
        if (count == list.length) {
            System.out.println("List is full!"); // Neu so nguoi = voi do dai mang in ra mang full
        } else {
            String newCode, newName;
            int newAge;
            Scanner sc = new Scanner(System.in);
            int pos;
            do {
                System.out.println("Enter the person's code: ");
                newCode = sc.nextLine().toUpperCase();
                pos = find(newCode);
                if (pos >= 0) {
                    System.out.println("\tThis code existed!");
                }
            } while (pos >= 0);//neu newCode bi phat hien da co trong danh sach thi in ra man hinh va bat nhap lai
   
                System.out.println("Enter the person's name: ");
                newName = sc.nextLine().toUpperCase();
         
            while(true){
                newAge = getAnInteger("Enter the person's age: ","Please, Enter a age!");
                if(newAge<100) break;
                else System.err.println("Error!");
            }
            list[count++] = new Person(newCode, newName, newAge);
            System.out.println("New person habe been added.");
        }
    }

    //Ham xoa 1 nguoi
    public void remove() {
        if (count == 0) { // neu list k co nguoi nao thi in ra mang trong va ket thuc
            System.out.println("Empty list.");
            return;
        }
        String removedCode;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code of removed person: ");
        removedCode = sc.nextLine().toUpperCase();
        int pos = find(removedCode);
        if (pos < 0) {
            System.out.println("This person does not exist.");// neu k tim thay removedCode trung voi code trong list  thi in ra
        } else {
            for (int i = pos; i < count - 1; i++) {
                list[i] = list[i + 1];
            }
            count--;
            System.out.println("The person " + removedCode + " was removed");
        }
    }

    //Chinh sua
    public void update() {
        if (count == 0) {
            System.out.println("Empty list.");
            return;
        }
        String code;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code of updated person: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if (pos < 0) {
            System.out.println("This person does not exist.");
        } else {
            String newName;
            int newAge;
            System.out.println("Enter the person's name: ");
            newName = sc.nextLine().toUpperCase();
             while(true){
                newAge = getAnInteger("Enter the person's age: ","Please, Enter a age!");
                if(newAge>0 && newAge<100) break;
                else System.err.println("Error!");
            }
            list[pos].setName(newName);//Chinh sua name va age thanh name va age moi
            list[pos].setAge(newAge);
            System.out.println("The person " + code + " was updated");//xuat ra man hinh da chinh sua
        }
    }

    //xuat ra man hinh list person
    public void print() {
        if (count == 0) {
            System.out.println("Empty List.");
            return;
        }
        System.out.println("LIST OF PERSON:");
        for (int i = 0; i < count; i++) {
            System.out.println(list[i].toString());
        }
    }

    //sort list theo tuoi
    public void sort() {
        if (count == 0) {
            return;
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = count - 1; j > i; j--) {
                if (list[j].getAge() > list[j - 1].getAge()) {
                    Person p = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = p;
                }
            }
        }
    }

    public static int getAnInteger(String inputMsg, String erroMsg) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(erroMsg);
            }
        }

    }
}
