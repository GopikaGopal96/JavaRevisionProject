package in.training;

public class AddNum {
	int a, b;
	public static void main(String []args) {
		int num1 =5;
		int num2 = 3;
		AddNum obj= new AddNum();
		obj.addition(num1,num2);
	}
	public void addition(int a, int b) {
		int sum= a+b;
		System.out.println("The sum of "+a+" and "+b+" is "+sum);
		this.a =a;
		this.b =b;
		System.out.println("A ="+a+" B ="+b);
		subtraction(a,b);
	}
	public void subtraction(int a,int b) {
		int diff = a-b;
		System.out.println("The difference is "+diff);
	}
}
