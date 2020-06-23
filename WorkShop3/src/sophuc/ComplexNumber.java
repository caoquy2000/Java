
package sophuc;

import java.util.Scanner;


public class ComplexNumber {
    private double phanThuc;
    private double phanAo;
    public ComplexNumber(){
        
    }
    public ComplexNumber(double a, double b){
        this.phanAo = b;
        this.phanThuc = a;
    }
    
    public void input(){
        System.out.println("Nhập số phức: ");
        Scanner sc = new Scanner(System.in);
        
        
        phanThuc = getAnDouble("Nhập phần thực: ","Error");
        
        phanAo = getAnDouble("Nhập phần ảo: ","Error");  
    }
    
    public void display(){
        System.out.println("Số phức: " + phanThuc + " + " + "i*" + phanAo);
    }
    
    public ComplexNumber add(ComplexNumber cNumber){
        double ketQuaPhanThuc = this.phanThuc + cNumber.phanThuc;
        double ketQuaPhanAo = this.phanAo + cNumber.phanAo;
        
        return new ComplexNumber(ketQuaPhanThuc,ketQuaPhanAo);
    }
    public ComplexNumber sub(ComplexNumber tNumber){
        double ketQuaPhanThuc = this.phanThuc - tNumber.phanThuc;
        double ketQuaPhanAo = this.phanAo - tNumber.phanAo;
        return new ComplexNumber(ketQuaPhanThuc,ketQuaPhanAo);
    }
    public ComplexNumber mul(ComplexNumber nNumber){
        double ketQuaPhanThuc = (this.phanThuc * nNumber.phanThuc)-(this.phanAo * nNumber.phanAo);
        double ketQuaPhanAo = (this.phanThuc * nNumber.phanAo + nNumber.phanThuc * this.phanAo);
        return new ComplexNumber(ketQuaPhanThuc,ketQuaPhanAo);
    }
    
    public double getAnDouble(String msgInput, String msgError){
        Scanner sc = new Scanner(System.in);
        double n;
        while(true){
        try{
            System.out.println(msgInput);
            n = Double.parseDouble(sc.nextLine());
            return n;
        }catch(Exception e){
            System.out.println(msgError);
        }
        }
    }
}
