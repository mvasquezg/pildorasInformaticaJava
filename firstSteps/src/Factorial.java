import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		//int result=1;
		Long result=1L;
		int num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
		
		for(int i=num; i>0; i--) {
			result=result*i;
		}
		
		System.out.println("El factorial de "+num+" es "+result);
		
		
		
	}

}
