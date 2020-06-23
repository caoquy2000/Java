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
public class Disk extends Shape {
    private double radius;
    public static final double PI = 3.14;
    public Disk(String name, String color, double radius){
        super(name, color);
        this.radius = radius;
    }
    @Override
    public double getAre(){
        return Disk.PI*Math.pow(radius, 2);
    }
    @Override
    public double getPerimeter(){
        return 2*radius*PI;
    }
    @Override
    public void paint() {
		System.out.printf("DISK      |%-10s|%-10s|%-9.1f|%-6.2f|%-6.2f\n",name,color,radius,getAre(),getPerimeter());
	}
}
