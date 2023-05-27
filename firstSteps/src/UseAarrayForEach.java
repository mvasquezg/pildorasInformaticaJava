import javax.swing.JOptionPane;

public class UseAarrayForEach {

	public static void main(String[] args) {
		/*String[] arrayCountries=new String[8];
		
		arrayCountries[0]="Espana";
		arrayCountries[1]="Mexico";
		arrayCountries[2]="Chile";
		arrayCountries[3]="Argentina";
		arrayCountries[4]="Peru";
		arrayCountries[5]="Venezuela";
		arrayCountries[6]="Colombia";
		arrayCountries[7]="Guatemala";*/
		
		/*for(int i=0; i<arrayCountries.length; i++) {
			System.out.println((i+1)+".-"+arrayCountries[i]);
		}*/
		
		/*String[] arrayCountries= {"Espana","Mexico","Chile","Argentina","Peru","Venezuela","Colombia","Guatemala"};
		*/
		String[] arrayCountries=new String[8];
		int j=1;
		
		for(int i=0; i<arrayCountries.length; i++) {
			arrayCountries[i]=JOptionPane.showInputDialog((i+1)+".-Ingresa el nombre de un pais: ");
		}
		
		for(String element:arrayCountries) {
			System.out.println(j+".-"+element);
			j++;
		}
	}

}
