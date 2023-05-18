package in.training;
import java.util.Scanner;
public class Voting {
	public static void main(String[] args) {
		boolean b = getAge();
		if(b==true) {
			System.out.println("Eligible for voting.");
		}
		else {
			System.out.println("Not eligible for voting.");
		}
	}
	public static boolean getAge(){
		System.out.println("Enter the age of the person:\n");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}
}
