
package data;
import java.util.Scanner;

public class Menu {
    String[] hints; //Tao 1 mang chua cac chuoi la hints
    int n = 0; //So hints hien tai.
    
    //Khoi tao menu voi so phan tu
    public Menu (int size){
        if(size<1) size=10; 
        hints = new String[size]; //Tao 1 mang chuoi co chieu dai bang size gan vao hints 
    }
    
    //Them hints
    public void add (String aHint){
        if(n<hints.length){ //neu so hints hien tai nho hon so hints khi khoi tao menu thi aHint them vao se
            hints[n++]=aHint;//duoc gan vao phan tu thu n+1 cua hints.
        }
    }
    
    //lay lua chon cua nguoi dung
    public int getChoice(){
        int result=0;
        if(n>0){
            for(int i = 0;i<n;i++)
                System.out.println( (i+1) + "-" + hints[i]);
            Scanner sc = new Scanner(System.in);
            while(true){
                result = getAnInteger("Please choose an operation:","Error!!");
                if(result>=1 && result<=5) break;
                else System.err.println("Error");;
            }
            
        }
        return result;
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
