package in.training;

public class FullTimeEmployee extends Employee {
	public void calculateSalary() {
		salary = salary*8;
		System.out.println("Salary of full time employee is: "+salary);
	}
	
	public static void main(String []args) {
		Contractor obj = new Contractor();
		obj.calculateSalary();
		FullTimeEmployee obj1= new FullTimeEmployee();
		obj1.calculateSalary();	
	}
}
