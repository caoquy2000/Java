
package data;
import java.util.Scanner;

public class Person {
    private String code="",name="";private int age=0;
    //constructor
    public Person(){
        
    }
    public Person(String c, String n, int a){
        code = c;
        name = n;
        age = a>0? a: 0;
       
    }
    
    //getter
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    //setter
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    //yeu cau ng dung nhap thong tin
   public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person's code: ");
        code = sc.nextLine();
        System.out.println("Enter the person's name: ");
        name = sc.nextLine();
        System.out.println("Enter the person's age: ");
        age = Integer.parseInt(sc.nextLine());
    }
    
    //ham bien tat ca thanh chuoi de xuat ra man hinh
    public String toString(){
        return code + ", " + name + ", " + age ;
    }
}
