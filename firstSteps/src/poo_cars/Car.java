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
	
	public String getGeneralData() {
		return "La plataforma del vehiculo tiene "+this.tire+" ruedas. Mide "+(this.length/1000)+" metros con un ancho de "+this.width+" cm y un peso de platorma de "+platformWeight+ " Kg";
	}
	
	public String getLength() {
		return "El largo del coche es: "+this.length+" cm";
	}
	
	
	public void setColor(String color) {
		//this.color="Azul";
		this.color=color;
	}
	
	public String getColor() {
		return "El color del coche es: "+this.color;
	}
	
	
	public void setLeatherSeats(String leatherSeats) {
		
		if(leatherSeats.equalsIgnoreCase("Si")) {
			this.leatherSeats=true;
		}else {
			this.leatherSeats=false;
		}
	}
	
	public String getLeatherSeats() {
		if(this.leatherSeats) {
			return "El coche tiene asientos de cuero.";
		}else {
			return "El coche tiene asientos genericos.";
		}
	}
	
}
