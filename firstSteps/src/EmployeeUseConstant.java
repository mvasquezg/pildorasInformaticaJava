
public class EmployeeUseConstant {
	private final String NAME;
	private String section;
	
	public EmployeeUseConstant(String name) {
		this.NAME=name;
		this.section="Administracion";
	}
	
	public void changeSection(String section) {
		this.section=section;
	}
	
	/*public void changeName(String name) {
		this.name=name;
	}*/
	
	public String getData() {
		return "El nombre es: "+this.NAME+" y la seccion es: "+this.section;
	}
}
