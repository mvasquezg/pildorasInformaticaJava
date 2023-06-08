package poo_cars;

public class Car {
	
	private int tire;
	private int length;
	private int width;	
	private int carEngine;
	private int platformWeight;
	
	private String color;
	private int totalWeight;
	private boolean airConditioning;
	private boolean leatherSeats;
	
	
	public Car() {
		this.tire=4;
		this.length=2000;
		this.width=300;
		this.carEngine=1600;
		this.platformWeight=500;
	}
	
	public String getLength() {
		return "El largo del coche es: "+this.length+" cm";
	}
	
	
	public void setColor() {
		this.color="Azul";
	}
	
	public String getColor() {
		return "El color del coche es: "+this.color;
	}
	
	
	
	
}
