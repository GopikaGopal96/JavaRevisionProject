package in.training;

public class ConstRev {
	int num;
	public static void main(String args[]) {
		ConstRev obj1 = new ConstRev(1234);
	}
	ConstRev(int num){
		this();
		this.num = num;
		int rem=0;
		System.out.println("Reverse of "+this.num);
		while(num>0) {
			rem = num%10;
			System.out.print(rem);
			num =num/10;
		}
	}
	ConstRev(){
		System.out.println("....Finding Reverse...");
	}
}
