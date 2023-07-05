
public class EmployeeUseConstant {
	private final String NAME;
	private String section;
	private int id;
	private static int idEmployee=1;
	
	public EmployeeUseConstant(String name) {
		this.id=idEmployee;
		this.NAME=name;
		this.section="Administracion";
		idEmployee++;
	}
	
	public void changeSection(String section) {
		this.section=section;
	}
	
	/*public void changeName(String name) {
		this.name=name;
	}*/
	
	public String getData() {
		return "Id del empleado: "+this.id+"\nEl nombre es: "+this.NAME+" y la seccion es: "+this.section;
	}
	
	public static String returnNextId() {
		return "El id siguiente: "+idEmployee;
	}
}
