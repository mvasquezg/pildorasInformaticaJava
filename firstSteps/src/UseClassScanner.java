import java.util.Scanner;

public class UseClassScanner {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
			
		String name="";
		byte age=0;
		
		System.out.print("Ingresa tu nombre, por favor: ");
		name=in.nextLine();
		
		System.out.print("Ingresa tu edad, por favor: ");
		age=in.nextByte();
		
		System.out.println("Hola "+name+" el ano que viene tendras "+(age+1)+" anos");
		
		
	}
	

}
