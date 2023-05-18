package in.training;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String []args) {
		int arr[]= {1,14,25,61,3,2,4,6,8,10};
		System.out.println("Enter the number to be searched: ");
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		int flag=0;
		for(int i=0;i<10;i++) {
			if(arr[i]==num) {
				System.out.println("The number "+num+" is at position "+i);
				flag=1;
				break;
			}
		}
		if (flag==0) {
			System.out.println("The number "+num+" is not in the array.");
		}
	}
}
