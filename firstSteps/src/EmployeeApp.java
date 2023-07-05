
public class EmployeeApp {

	public static void main(String[] args) {
		EmployeeUseConstant employee1=new EmployeeUseConstant("Paco");
		EmployeeUseConstant employee2=new EmployeeUseConstant("Ana");
		
		employee1.changeSection("RH");
		//employee1.changeName("Maria");
		
		System.out.println(employee1.getData());
		System.out.println(employee2.getData());
	}

}
