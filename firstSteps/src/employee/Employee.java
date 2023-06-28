package employee;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private String name;
	private double salary;
	private Date dischargeDate;
	
	public Employee(String name, double salary, int year, int month, int day) {
		this.name=name;
		this.salary=salary;
		GregorianCalendar calendar=new GregorianCalendar(year, month-1, day);
		this.dischargeDate=calendar.getTime();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Date getDischarDate() {
		return this.dischargeDate;
	}
	
	public void raiseTheSalary(double percent) {
		double increment=(this.salary*percent)/100;
		this.salary+=increment;
	}
}
