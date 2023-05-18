package in.training;

public class ConstructorExample {
	public static void main(String []args) {
		System.out.println("Constructor Example");
		ConstructorExample obj = new ConstructorExample();
		obj.addition();
	}
	public void addition() {
			int a =10;
			int b =5;
			int sum=a+b;
			System.out.println("Sum is "+sum);
	}
	ConstructorExample(){
		System.out.println("Inside constructor");
	}
}
