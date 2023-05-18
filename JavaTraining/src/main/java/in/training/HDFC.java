package in.training;
import java.util.Scanner;

public class HDFC implements RBI {

	public static void main(String[] args) {
		int amount, duration;
		System.out.println("Enter the amount to be deposited:");
		Scanner sc= new Scanner(System.in);
		amount=sc.nextInt();
		System.out.println("Enter the duration:");
		duration=sc.nextInt();
		HDFC obj= new HDFC();
		obj.recurringDeposit(amount, duration);
	}
	
	public void recurringDeposit(int amount, int duration) {
		float rate = interestrate/10;
		rate=rate+1;
		float total=amount*rate*duration;
		System.out.println("The maturity amount :"+total);
	}

	

}
