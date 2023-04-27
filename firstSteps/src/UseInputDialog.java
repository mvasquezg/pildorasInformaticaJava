import javax.swing.JOptionPane;

public class UseInputDialog {

	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("Ingrese su nombre por favor: ");
		
		String age=JOptionPane.showInputDialog("Ingresa su edad por favor: ");
		
		int ageUser=Integer.parseInt(age);
		
		//System.out.println("Hola "+name+" tienes "+age+" anios, el anio que viene tendras: "+(ageUser+1)+" anios");
		
		ageUser++;
		System.out.println("Hola "+name+" tienes "+age+" anios, el anio que viene tendras: "+ageUser+" anios");
	}

}
