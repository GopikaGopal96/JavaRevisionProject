package in.training;

import java.util.Scanner;

class Prime{
	public static void main(String []args){
		System.out.println("Enter the number to check Prime or not:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int half = num/2;
		int flag = 0;
		if(num==0||num==1){
			System.out.println("Number "+num+" is neither Prime nor Non-prime.");
			}
		else{
			for(int i=2; i<=half;i++){
				if(num%i==0){
					System.out.println("Number "+num+" is not Prime.");
					flag = 1;
					break;
					}
				}
			if(flag==0){
				System.out.println("Number "+num+" is Prime.");
				}
			}
		}
}