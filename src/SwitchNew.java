import java.util.Scanner;

public class SwitchNew {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String day;
		
		System.out.print("Ingresa el dia de la semana: ");
		day=in.nextLine();
		
		/*String result =switch(day) {
			case "Lunes"-> "Dia Laborable";
			case "Martes"-> "Dia Laborable";
			case "Miercoles"-> "Dia Laborable";
			case "Jueves"-> "Dia Laborable";
			case "Viernes"-> "Dia Laborable";
			case "Sabado"-> "Dia Descanso";
			case "Domingo"-> "Dia Descanso";
			default -> "Dia incorrecto";
		}*/
		
		/*String result =switch(day) {
		case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"-> "Dia Laborable";
		 case "Sabado", "Domingo"-> "Dia Descanso";
		default -> "Dia incorrecto";
		}*/
		
		/*String result =switch(day) {
		case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"-> "Dia Laborable";
		 case "Sabado", "Domingo"-> "Dia Descanso";
		default -> {
			System.out.println("Procesando...");
			yield "Dia incorrecto";
			
		}
		
		}*/
	}

}
