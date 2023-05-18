package in.training;
import java.util.Scanner;
class Factorial{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to find the factorial:");
		int num = sc.nextInt();
		fact(num);
		
	}
	public static void fact(int num){
		int temp=num-1;
		for(int i=temp;i>0;i--){
			num=num*i;
			}
		System.out.println("The factorial of "+(temp+1)+" is : "+num);
	}
}
