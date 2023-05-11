import javax.swing.JOptionPane;

public class IdealWeight {

	public static void main(String[] args) {
		String gender="";
		int idealWeight=0;
		do {
			gender=JOptionPane.showInputDialog("Ingresa tu genero (H o M)");
			
		}while(gender.equalsIgnoreCase("H")==false && gender.equalsIgnoreCase("M")==false);//end do-while
	
	
	int height=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu estatura en centimetros"));
	

	
	if(gender.equalsIgnoreCase("H")) {
		idealWeight=height-110;
	}else if(gender.equalsIgnoreCase("M")){
		 idealWeight=height-120;
	}
	
	System.out.println("Tu peso ideal es: "+idealWeight+" kg");
	
	}
	
}
