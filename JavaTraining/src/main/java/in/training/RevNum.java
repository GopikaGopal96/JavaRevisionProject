package in.training;
import java.util.Scanner;

public class RevNum {
	public static void main(String []args) {
		System.out.println("Enter the number to find the reverse:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int remainder =0;
		while(num>0) {
			remainder = num%10;
			System.out.print(remainder);
			num=num/10;
		}
	}
}
