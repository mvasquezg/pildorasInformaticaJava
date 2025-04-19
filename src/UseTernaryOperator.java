import java.util.Scanner;

public class UseTernaryOperator {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int age=0;
		
		System.out.print("Ingresa tu edad: ");
		age=in.nextInt();
		
		/*if(age<18) {
			System.out.println("Eres menor de edad.");
		}else {
			System.out.println("Eres mayor de edad.");
		}*/
		
		System.out.println(age<18?"Eres menor de edad.":"Eres mayor de edad.");
		 
	}

}
