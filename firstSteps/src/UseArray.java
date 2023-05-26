
public class UseArray {

	public static void main(String[] args) {
		/*int[] myArray=new int[5];
		
		myArray[0]=5;
		myArray[1]=38;
		myArray[2]=-15;
		myArray[3]=92;
		myArray[4]=71;
		
		/*System.out.println("El valor de la posicion 1 es: "+myArray[0]);
		System.out.println("El valor de la posicion 2 es: "+myArray[1]);
		System.out.println("El valor de la posicion 3 es: "+myArray[2]);
		System.out.println("El valor de la posicion 4 es: "+myArray[3]);
		System.out.println("El valor de la posicion 5 es: "+myArray[4]);
		*/
		
		/*int[] myArray= {5, 38, -15, 92, 71};
		
		for(int i=0; i<5; i++) {
			System.out.println("El valor de la posicion 5 es: "+myArray[i]);
		}*/
		
		int[] myArray= {5, 38, -15, 92, 71, 55, 12, 37, 65, 99};
		
		for(int i=0; i<myArray.length; i++) {
			System.out.println("El valor de la posicion "+(i+1)+" es: "+myArray[i]);
		}
	
	}

}
