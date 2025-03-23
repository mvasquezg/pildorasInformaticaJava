import java.util.Scanner;

public class UseIf {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int age=0;
		
		System.out.print("Ingresa tu edad: ");
		age=in.nextInt();
		
		/*if(age>=18) {
			System.out.println("Eres mayor de edad.");
		}else {
			System.out.println("Eres menor de edad.");
		}*/
		
		if(age<=18) {
			System.out.println("Eres muy joven.");
		}else if(age<=35){
			System.out.println("Eres joven.");
		}else if(age<=60) {
			System.out.println("Eres maduro.");
		}else if(age<=90) {
			System.out.println("Eres Adulto.");
		}else {
			System.out.println("Edad no permitida.");	
		}

	}

}
