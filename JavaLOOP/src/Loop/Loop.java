/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loop;

/**
 *
 * @author DELL
 */
public class Loop {
    public static void main(String[] args){
        System.out.println("Hello");
        int a[] = {1,2,3,4,5};
        for (int i=0; i<a.length;i++)System.out.print(a[i] + ",");
        System.out.println();
        for (int x : a) {
            System.out.print(x+",");
        }
        System.out.println();
        for (int x : a) {
            x+=10;
            System.out.print(x+",");
        }
        System.out.println();
        for(int i=0;i<a.length;i++)System.out.print(a[i]+",");
        System.out.println();
    }
}
