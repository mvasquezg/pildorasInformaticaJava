
public class UsesVariables {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaracion
		//byte age;
		//Inicializacion
		//age=17;
		
		//Declaracion e incializacion
		//byte age=17;
		
		//System.out.println(age);
		
		//Declaracion simultanea
		/*int operador1, operador2, result;
		
		operador1=7;
		operador2=9;
		
		result=operador1+operador2;*/
		
		//declracion e inicializacion simultanea
		//int operador1=4, operador2=9, result=operador1+operador2;
		
		
		byte operador1=4;
		byte operador2=9;
		
		//Casting
		byte result=(byte) (operador1+operador2);
		
		
		//System.out.println( ((Object)operador1).getClass().getSimpleName());
		//System.out.println( ((Object)operador2).getClass().getSimpleName());
		
		System.out.println( ((Object)(operador1+operador2)).getClass().getSimpleName());
		
	}

}
