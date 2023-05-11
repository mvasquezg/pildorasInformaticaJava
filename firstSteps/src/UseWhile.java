import javax.swing.JOptionPane;

public class UseWhile {

	public static void main(String[] args) {
		String pwd="Juan";
		
		String password="";
		
		while(pwd.equals(password)==false) {
				
			password=JOptionPane.showInputDialog("Ingrese su contrasena: ");
			
			if(pwd.equals(password) == false) {
				System.out.println("Contrasena incorrecta");
			}
		}//end while
		
		System.out.println("Contrasena correcta. Acceso Permitido");
		
	}//end main

}
