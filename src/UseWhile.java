import javax.swing.JOptionPane;

public class UseWhile {

	public static void main(String[] args) {
		String password="Lunes";

		String pass="";
		
		while(password.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Introduce contraseña:");
			
			if(password.equals(pass)==false) {
				System.out.println("Coantraseña incorrceta");
			}
		}
		
		System.out.println("Acceso Correcto");
		
	}

}
