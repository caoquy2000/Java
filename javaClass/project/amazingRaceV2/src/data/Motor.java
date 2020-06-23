package data;

import java.util.Random;

public class Motor implements DeadRacer{
	//Moto muốn kết nối với hội đua
	public static final double MAX_SPEED = 150.0;
	private String model; //exciter 2020
	private int yob;
	private double volumne;
	private String vin; //vihical identifier number
	public Motor(String model, int yob, double volumne, String vin) {
		this.model = model;
		this.yob = yob;
		this.volumne = volumne;
		this.vin = vin;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public double getVolumne() {
		return volumne;
	}
	public void setVolumne(double volumne) {
		this.volumne = volumne;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public double run() {
		return new Random().nextDouble() * MAX_SPEED;
	}
	public void showRecord() {
		System.out.printf("|Motor  |%-15s|%4d|%4.1f|%s|%-5.1f\n",model,yob,run(),vin,volumne);
	}
	@Override
	public double runToDead() {
		
		return run()*3;
	}
	@Override
	public void showToQuocGhiCong() {
		System.out.printf("|Motor  |%-15s|%4d|%4.1f|%s|%-5.1f\n",model,yob,runToDead(),vin,volumne);
	}
}
