
package sophuc;

public class Program {
    public static void main (String[] args){
       ComplexNumber sophuc1 = new ComplexNumber();
       sophuc1.input();
       ComplexNumber sophuc2 = new ComplexNumber();
       sophuc2.input();
       
       ComplexNumber ketqua = new ComplexNumber();
       ketqua = sophuc1.add(sophuc2);
       ComplexNumber ketqua1 = new ComplexNumber();
       ketqua1 = sophuc1.sub(sophuc2);
       ComplexNumber ketqua2 = new ComplexNumber();
       ketqua2 = sophuc1.mul(sophuc2);
       
       ketqua.display();
       ketqua1.display();
       ketqua2.display();
    }
}
