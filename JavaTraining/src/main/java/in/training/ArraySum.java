package in.training;
import java.util.Scanner;

public class ArraySum {
	public static void main(String []args) {
		System.out.println("Enter the limit of the array:");
		Scanner sc= new Scanner(System.in);
		int limit = sc.nextInt();
		int sum =0;
		int arr[]= new int[limit];
		System.out.println("Enter the elements:");
		for(int i=0;i<limit;i++) {
			arr[i]= sc.nextInt();
		}
		for(int j=0;j<limit;j++) {
			sum=sum+arr[j];
		}
		System.out.println("The sum of elements in array is :"+sum);
	}
}
