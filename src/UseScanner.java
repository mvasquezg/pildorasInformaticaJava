import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("Ingresa tu nombre: ");
		name=in.nextLine();
		
		System.out.print("Ingresa su edad: ");
		age=in.nextInt();
		
		System.out.println("\nHola: "+name+"\nEdad: "+age+" años");
		
		in.close();
	}

}
