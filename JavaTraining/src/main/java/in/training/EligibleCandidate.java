package in.training;
import java.util.Scanner;

public class EligibleCandidate {
	public static void main(String []args) {
		int marks;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total mark of the candidate:");
		marks=sc.nextInt();
		if(marks>=50) {
			System.out.println("Candidate eligible for admission");
		}
		else {
			System.out.println("Candidate is not eligible for admission");
		}
	}
}
