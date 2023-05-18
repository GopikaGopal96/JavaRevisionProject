package in.training;
import java.util.Scanner;

public class OnSeason extends OffSeason{
	int discamt,total,price,opt;
	OnSeason(){
		System.out.println("Enter the option : \n1.On Season Purchase\n2.Off Season Purchase\n");
		Scanner sc= new Scanner(System.in);
		opt = sc.nextInt();
		}
	public int discount(int price) {
		discamt=(price*40)/100;
		total = price-discamt;
		return total;
	}
	public static void main(String []args) {
		int purchaseamt;
		int finalamt;
		OnSeason obj1=new OnSeason();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		purchaseamt=sc.nextInt();
		if(obj1.opt==1) {
			finalamt =obj1.discount(purchaseamt);
			System.out.println("The final amount is "+finalamt);
		}
		else {
			obj1.call(purchaseamt);
		}
	}
	public void call(int purchaseamt) {
		super.discount(purchaseamt);
		System.out.println("The final amount is "+amount);
	}
}
