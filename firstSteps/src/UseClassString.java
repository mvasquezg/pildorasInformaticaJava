
public class UseClassString {

	public static void main(String[] args) {
		String name="Miguel";
		
		System.out.println("Nombre: "+name+"\nEl nombre tiene: "+name.length()+" letras");
		
		System.out.println("La primera letra de "+name+" es la letra "+name.charAt(0));
		
		int lastLetter=name.length();
		
		System.out.println("La ultima letra de "+name+" es la letra "+name.charAt(lastLetter-1));

				
	}

}
