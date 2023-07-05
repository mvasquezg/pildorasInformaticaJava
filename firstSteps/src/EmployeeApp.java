
public class EmployeeApp {

	public static void main(String[] args) {
		EmployeeUseConstant employee1=new EmployeeUseConstant("Paco");
		EmployeeUseConstant employee2=new EmployeeUseConstant("Ana");
		EmployeeUseConstant employee3=new EmployeeUseConstant("Antonio");
		
		employee1.changeSection("RH");
		//employee1.changeName("Maria");
		
		System.out.println(employee1.getData());
		//EmployeeUseConstant.idEmployee++;
		System.out.println();
		System.out.println(employee2.getData());
		//EmployeeUseConstant.idEmployee++;
		System.out.println();
		System.out.println(employee3.getData());
		System.out.println();
		System.out.println(EmployeeUseConstant.returnNextId());
		
		
	}

}
