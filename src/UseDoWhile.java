import java.util.Scanner;

public class UseDoWhile {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//System.out.println(Math.random()*100);
		
		int randomNumber=(int)(Math.random()*100);
		
		int	attempts=0;
		
		int userNumber=0;
		
		do {
			
			attempts++;
			
			System.out.print("Ingresa un numero entre 1 y 100: ");
			userNumber=in.nextInt();
			
			if(randomNumber>userNumber) {
				System.out.println("El numero que has ingresado es Menor.");
			}else if(randomNumber<userNumber){
				System.out.println("El numero que has ingresado es Mayor.");
			}
			
			System.out.println();
		}while(randomNumber!=userNumber);
		
		
		
		System.out.println("Numero Corecto: "+userNumber+" lo lograstes en "+attempts+" intentos");

	}

}
