import javax.swing.JOptionPane;

public class TryMail {

	public static void main(String[] args) {
		//boolean at=false;
		
		int at=0;
		boolean dot=false;
		
		String mail=JOptionPane.showInputDialog("Introduce un mail");
		
		for(int i=0; i<mail.length();i++) {
			if(mail.charAt(i)=='@') {
				//at=true;
				at++;
			}
			
			if(mail.charAt(i)=='.') {
				dot=true;
			}
		}
		
		/*if(at==true) {
			System.out.println("mail correcto");
		}else {
			System.out.println("mail incorrecto");
		}*/
		
		if(at==1 && dot == true) {
			System.out.println("mail correcto");
		}else {
			System.out.println("mail incorrecto");
		}
		
	}

}
