package poo_cars;

public class Van extends Car {

	private int extraWeight;
	private int extraSeats;
	
	public Van(int extraSeats, int extraWeight) {
		super();//LLama al constructor de la clase padre
		this.extraWeight=extraWeight;
		this.extraSeats=extraSeats;
	}
	
	public String getDataVan() {
		return "La capacidad de carga es: "+extraWeight+"\nLos asientos extras son: "+extraSeats;
	}
	
}
