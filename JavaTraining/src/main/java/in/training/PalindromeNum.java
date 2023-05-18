package in.training;
import java.util.Scanner;
public class PalindromeNum {
	public static void main(String []args) {
		System.out.println("Enter the number to check if Palindrome or not:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		int temp =num;
		while(num>0) {
			int remainder = num%10;
			sum = (sum*10)+remainder;
			num = num/10;
		}
		if(sum==temp) {
			System.out.println("The number "+temp+" is Palindrome");
		}
		else {
			System.out.println("The number "+temp+" is not Palindrome");
		}
	}
}
