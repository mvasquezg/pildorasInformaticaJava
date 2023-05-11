import java.util.Scanner;

public class GueesNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int randomNum=(int)(Math.random()*100);
		
		int num=0;
		
		int intentos=0;
		
		while(num!=randomNum) {
			intentos++;
			System.out.print("Ingresa un numero: ");
			num=in.nextInt();
			
			if(randomNum<num) {
				System.out.println("El numero a hayar es mas bajo");
			}else if(randomNum>num) {
				System.out.println("El numero a hayar es mas alto");
			}
			
		}
		
		System.out.println("El numero es corecto, lo lograstes en "+intentos+" intentos");
		
	}

}
