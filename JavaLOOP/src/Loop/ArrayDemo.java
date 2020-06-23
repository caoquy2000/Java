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
public class ArrayDemo {
    public static void main(String[] args){
        char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a',
            'c','e','d'
        };
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        //arraycopy giong nhu ham cat chuoi
        System.out.println(new String(copyTo));
    }
}
