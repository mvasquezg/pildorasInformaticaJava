import java.util.Scanner;

public class ConditionalIf {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		Byte age=0;
		
		System.out.print("Ingresa tu edad: ");
		age=in.nextByte();
		
		/*if(age>=18) {
			System.out.println("Eres mayor de edad.");
		}else {
			System.out.println("Eres menor de edad.");
		}*/
		
		if(age<18) {
			System.out.println("Eres un adolescente.");
		}else if(age<40){
			System.out.println("Eres joven.");
		}else if(age<65) {
			System.out.println("Eres maduro.");
		}else {
			System.out.println("cuidate.");
		}
		
		
		
	}

}
