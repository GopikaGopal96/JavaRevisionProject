package in.training;
import java.util.Scanner;

public class Discount {
	public static void main(String []args) {
		float arr[]=getPrices();
		float sum= totals(arr);
		float discamt = checkdis(sum);
		float finalamt = sum-discamt;
		System.out.println("The discount price is "+discamt);
		System.out.println("\nThe final amount is "+finalamt);
	}
	public static float[] getPrices() {
		Scanner sc= new Scanner(System.in);
		float arr[]= new float[5];
		System.out.println("Enter the prices of items purchased:\n");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextFloat();
			}
		return(arr);
		}
	public static float totals(float[] arr) {
		float sum=0;
		for(int i=0;i<5;i++) {
			sum= sum+arr[i];
		}
		System.out.println("The total amount is "+sum);
		return sum;
	}
	public static float checkdis(float sum) {
		float amt =0;
		if(sum>5000) {
			System.out.println("Eligible for 20% discount\n");
			amt = (sum*20)/100;
			return amt;
		}
		else {
			System.out.println("Not eligible for discount\n");
			return amt;
		}
	}
}
