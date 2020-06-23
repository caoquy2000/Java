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
public class Operator {
    public static void main(String[] args){
        int [] a= {4,4};
        int b=1;
        a[b] = b = 0;
        System.out.println("a: "+ a[0]+","+a[1]);
    }
}
