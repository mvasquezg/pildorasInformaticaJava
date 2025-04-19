import javax.swing.JOptionPane;

public class DoWhileIdealWeight {

	public static void main(String[] args) {
		String genre;
		int idealWeight;
		
		do {
			
			genre=JOptionPane.showInputDialog("Ingresa tu sexo:\n Hombre(H)\nMujer(M);");
			
		}while(genre.equalsIgnoreCase("H")==false && genre.equalsIgnoreCase("M")==false);
		
		int height=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu estaura en CM: "));
		
		if(genre.equalsIgnoreCase("h")) {
			idealWeight=height-110;
		}else {
			idealWeight=height-120;
		}
		
		JOptionPane.showConfirmDialog(null, "Tu peso ideal es: "+idealWeight);

	}

}
