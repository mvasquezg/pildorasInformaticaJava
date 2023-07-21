package employee;

public class EmployeeBoss extends Employee {
	
	private double incentive;

	public EmployeeBoss(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);	
	}
	
	public double getIncentive() {
		return incentive;
	}
	
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	public double getSalary() {
		double salaryBoss=super.getSalary();
		
		return salaryBoss+this.incentive;
	}
	
}
