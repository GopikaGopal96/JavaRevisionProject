package in.training;
import java.util.Scanner;

public class Contractor extends Employee{
	public void calculateSalary() {
		System.out.println("Enter the working hours: ");
		Scanner sc = new Scanner(System.in);
		int hours= sc.nextInt();
		salary = salary*hours;
		System.out.println("Salary of contractor is: "+salary);
	}

}
