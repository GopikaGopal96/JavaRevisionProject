package in.training;

import java.util.Scanner;

public class Pay {
	float basic;
	float deduction;
	float bonus;
		public void getPay() {
			System.out.println("Enter the basic pay, deduction and bonus:");
			Scanner sc= new Scanner(System.in);
			basic = sc.nextFloat();
			deduction = sc.nextFloat();
			bonus = sc.nextFloat();
			System.out.println("Basic Pay: "+basic+"\nDeduction:"+deduction+"\nBonus: "+bonus);
		}
}
