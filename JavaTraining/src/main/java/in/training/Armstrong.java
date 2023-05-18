package in.training;
import java.util.Scanner;

public class Armstrong{
	public static void main(String []args) {
		System.out.println("Enter a number to check if Armstrong or not:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int cube = 0;
		int digit =0;
		while(num>0) {
			digit = num%10;
			cube = digit*digit*digit;
			sum = sum+cube;
			num =num/10;
		}
		if(sum == temp) {
			System.out.println("The number "+temp+" is Armstrong");
		}
		else {
			System.out.println("The number "+temp+" is not Armstrong");
		}
	}
}
