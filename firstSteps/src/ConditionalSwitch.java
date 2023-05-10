import java.util.Scanner;
import javax.swing.JOptionPane;

public class ConditionalSwitch {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		byte option=0;
		int base=0, height=0, radio=0;
		
		System.out.print("Elija una opcion: \n1.-Cuadrado\n2.-Rectangulo\n3.-Triangulo\n4.-Circulo\nopcion: ");
		option=in.nextByte();
		
		switch (option) {
		case 1:
			System.out.print("\n\n*******************\nCalcula el area del cuadrado\n\nIngresa un lado del cuadrado: ");
			base=in.nextInt();
			System.out.println("El area del cuadrado que mide por lado: "+base+"\nsu area es: "+Math.pow(base, 2));
			break;
		case 2:
			System.out.print("\n\n*******************\nCalcula el area del rectangulo\n\nIngresa la base del rectangulo: ");
			base=in.nextInt();
			System.out.print("Ingresa la altura del rectangulo: ");
			height=in.nextInt();
			
			System.out.println("El area del rectangulo que mide por base: "+base+" y de altura: "+height+"\nsu area es: "+(base*height));
			break;
		case 3:
			System.out.print("\n\n*******************\nCalcula el area del triangulo\n\nIngresa la base del triangulo: ");
			base=in.nextInt();
			System.out.print("Ingresa la altura del triangulo: ");
			height=in.nextInt();
			
			System.out.println("El area del triangulo que mide por base: "+base+" y de altura: "+height+"\nsu area es: "+((base*height)/2));
			break;
		case 4:
			System.out.print("\n\n*******************\nCalcula el area del circulo\n\nIngresa el radio del circulo: ");
			base=in.nextInt();
			
			System.out.println("El area del circulo que mide por radio: "+base+"\n su area es: "+(Math.PI*Math.pow(base, 2)));
			break;	
		default:
			System.out.println("No existe la figura geometrica");
			break;
		}
	}

}
