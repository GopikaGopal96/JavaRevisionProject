package in.training;

public class PalindromeAndRev {
	public static void main(String []args) {
		int num = Integer.parseInt(args[0]);
		reverse(num);
		palindrome(num);
	}
	public static void reverse(int num) {
		int remainder = 0;
		System.out.println("....PRINTING THE REVERSE OF THE NUMBER....\nThe reverse of "+num+" is :");
		while(num>0) {
			remainder = num%10;
			num = num/10;
			System.out.print(remainder);
		}
		}
	public static void palindrome(int num) {
		int digit = 0;
		int temp = num;
		int sum= 0;
		while(num>0) {
			digit = num%10;
			sum = (sum*10)+digit;
			num=num/10;
		}
		System.out.println("\n....CHECKING PALINDROME OR NOT....");
		if(sum==temp) {
			System.out.println("The number "+temp+" is Palindrome");
		}
		else {
			System.out.println("The number "+temp+" is not Palindrome");
		}
	}
}
