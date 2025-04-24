import javax.swing.JOptionPane;

public class UseForValidateMail {

	public static void main(String[] args) {
		
		String email=JOptionPane.showInputDialog("Ingresa tu mail: ");
		boolean emailTrue=false;
		
		for(int i=0; i<email.length(); i++) {
			
			if(email.charAt(i)=='@') {
				emailTrue=true;
			}
		}
		
		if(emailTrue) {
			System.out.println("El coreo es valido");
		}else {
			System.out.println("El correo es invalido");
		}
		
	}

}
