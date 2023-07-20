package employee;

public class EmployeApp {

	public static void main(String[] args) {
		
		/*Employee employee1=new Employee("Miguel Vasquez", 85000, 1990, 12, 17); 
		
		Employee employee2=new Employee("Carolina Garcia", 95000, 1995, 6, 2);
		
		Employee employee3=new Employee("Uciel Laguna", 105000, 2002, 3, 15);
		
		employee1.raiseTheSalary(5);
		
		employee2.raiseTheSalary(5);
		
		employee3.raiseTheSalary(5);
		
		System.out.println("Nombre: "+employee1.getName()+"\nSueldo: "+employee1.getSalary()+"\nFecha alta: "+employee1.getDischarDate());
		
		System.out.println("\nNombre: "+employee2.getName()+"\nSueldo: "+employee2.getSalary()+"\nFecha alta: "+employee2.getDischarDate());
		
		System.out.println("\nNombre: "+employee3.getName()+"\nSueldo: "+employee3.getSalary()+"\nFecha alta: "+employee3.getDischarDate());
		*/
		
		Employee[] arrayEmployee=new Employee[4];
		
		arrayEmployee[0]=new Employee("Miguel Vasquez", 85000, 1990, 12, 17);
		arrayEmployee[1]=new Employee("Carolina Garcia", 95000, 1995, 6, 2);
		arrayEmployee[2]=new Employee("Uciel Laguna", 105000, 2002, 3, 15);
		arrayEmployee[3]=new Employee("Juan Ramon");
		
		/*for(int i=0;i<3;i++) {
			arrayEmployee[i].raiseTheSalary(5);
		}*/
		
		for(Employee e:arrayEmployee) {
			e.raiseTheSalary(5);
		}
		
		/*for(int i=0;i<3;i++) {
		 System.out.println("\n\nNombre: "+arrayEmployee[i].getName()+"\nSueldo: "+arrayEmployee[i].getSalary()+"\nFecha alta: "+arrayEmployee[i].getDischarDate());
		 
		 
		}*/
		
		/*for(int i=0;i<3;i++) {
			 System.out.println("\n\nNombre: "+arrayEmployee[i].getName()+"\nSueldo: "+arrayEmployee[i].getSalary()+"\nFecha alta: "+arrayEmployee[i].getDischarDate());
			 
			 
			}*/
		for(Employee e: arrayEmployee) {
			 System.out.println("\n\nNombre: "+e.getName()+"\nSueldo: "+e.getSalary()+"\nFecha alta: "+e.getDischarDate());
		}
	}
}
