import java.util.Scanner;

public class GuessNumberDoWhile {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
		
		int randomNum=(int)(Math.random()*100);
		
		int num=0;
		
		int intentos=0;
		
		do {
			intentos++;
			System.out.print(intentos+".-Ingresa un numero: ");
			num=in.nextInt();
			
			if(randomNum<num) {
				System.out.println("El numero a hayar es mas bajo\n");
			}else if(randomNum>num) {
				System.out.println("El numero a hayar es mas alto\n");
			}
			
		}while(num!=randomNum);
		
		System.out.println("El numero es corecto, lo lograstes en "+intentos+" intentos");

	}

}
