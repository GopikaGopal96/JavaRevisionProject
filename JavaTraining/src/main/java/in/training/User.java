package in.training;
import java.util.Scanner;

public class User extends Bank {
	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the pin");
		int pin = sc.nextInt();
		User obj=new User();
		obj.getPin(pin);
	}
	
}
