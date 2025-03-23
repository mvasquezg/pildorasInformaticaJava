import javax.swing.JOptionPane;

public class UseJoptionPane {

	public static void main(String[] args) {
		
		String name=JOptionPane.showInputDialog("Ingresa Nombre: ");
		//String age =JOptionPane.showInputDialog("Ingresa tu edad: ");
		
		int age =Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));
	
		//System.out.println("Hola: "+name+"\nEdad: "+age+" años");
		
		System.out.println("Hola: "+name+"\nEl año que viene tendras: "+(age+1)+" años");

	}

}
