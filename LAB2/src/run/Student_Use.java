
package run;
import data.*;

public class Student_Use {
    public static void main(String[] args){
        Student StudentList[] = new Student[100];
        Student SV1 = new Student("Cao Hoang","Quy",10);
        SV1.outPut();
        Student SV2 = new Student();
        SV2.intPut();
        SV2.outPut();
    }
}
