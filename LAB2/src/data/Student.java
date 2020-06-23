
package data;
import java.util.Scanner;


public class Student {
    String lastName;
    String firstName;
    double point;

    public Student(String lastName, String firstName, double point) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.point = point;
    }
    public Student(){
        
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getPoint() {
        return point;
    }
   
    public void setLastName(String lastName) {
       this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPoint(double point) {
        this.point = point;
    }
    
 
    public void intPut(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last name:");
        lastName = sc.nextLine();

        
        
        System.out.println("Enter first name:");
        firstName = sc.nextLine();
        
        
        System.out.println("Enter point:");
        while(true){
            try{
                point = Integer.parseInt(sc.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Nhap lai!");
            }
        }
    }
    public String rank(){
        if(point>=8&&point<=10){
            return "Excellent";
        } 
        if(point>=7&&point<8){
            return "Good";
        } 
        if(point<7&&point>=5){
            return "Average";
        } 
        if(point<5&&point>=0){
            return "Weak";
        }else{
            return "Error";
        }
    }
    public void outPut(){
        System.out.println("Full Name: " + lastName + " " + firstName + " Point " + point + " Rank " + rank());
    }
}
