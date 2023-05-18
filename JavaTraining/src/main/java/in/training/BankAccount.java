package in.training;
import java.util.Scanner;
public class BankAccount {
	static int amt = 0;
	public static void main(String []args) {
		deposit();
		withdraw();
		balance();
	}
	public static void deposit() {
		System.out.println("Enter the amount to be deposited:\n");
		Scanner sc= new Scanner(System.in);
		int dep = sc.nextInt();
		amt = amt+dep;
		System.out.println(dep+" deposited successfully\n");
		}
	public static void withdraw() {
		System.out.println("Enter the amount to withdraw:\n");
		Scanner sc1= new Scanner(System.in);
		int draw = sc1.nextInt();
		if(draw<=amt) {
			amt = amt-draw;
			System.out.println(draw+" withdrawn successfully\n");
		}
		else {
			System.out.println("Insufficient balance!!");
		}
	}
	public static void balance() {
		System.out.println("The balance is "+amt);
	}
}

