import javax.swing.JOptionPane;

public class NumbersInputs {

	public static void main(String[] args) {
		//double x=100000.0;
		
		//System.out.printf("%1.2f", x/3);
		
		String num1=JOptionPane.showInputDialog("Ingresa un numero: ");
		
		double num2=Double.parseDouble(num1);
		
		System.out.println("La raiz de "+num2+" es ");
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
