/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author DELL
 */
public class Square extends Rectangle {
    public Square(String name, String color, double edge){
        super(name,color,edge,edge);
    }
    public void Hello(){
        
    }
    @Override
    public void paint(){
        System.out.printf("SQUARE    |%-10s|%-10s|%-4.1f|%-4.1f|%-6.2f|%-6.2f\n",name,color,width,length,getAre(),getPerimeter());
    }
}