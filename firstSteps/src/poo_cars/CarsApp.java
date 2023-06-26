package poo_cars;

public class CarsApp {

	public static void main(String[] args) {
		
		Car car1=new Car(); //Instaciar clase. Ejemplar de Clase
		
		car1.setColor("Marron");
		//System.out.println("El coche car1 tiene "+car1.tire+" llantas");
		System.out.println(car1.getGeneralData()+"\n"+car1.getLength()+"\n"+car1.getColor());
		
		car1.setLeatherSeats("SI");
		
		System.out.println(car1.getLeatherSeats());
		
		car1.setAirConditioning("si");
		
		System.out.println(car1.getAirConditioning());
		
		System.out.println(car1.getTotalWeight());
		
		System.out.println("El precio final del coche es: "+car1.getCarPrice());
	}

}
