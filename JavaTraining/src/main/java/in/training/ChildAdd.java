package in.training;

public class ChildAdd extends SuperAdd{
	public static void main(String args[]){
		ChildAdd obj = new ChildAdd();
		obj.add();
	}
	public void add() {
		int total = super.add(5, 30);
		if (total%10==0){
			System.out.println("The result "+total+" is divisible by 10");
		}
		else {
			System.out.println("The result "+total+" is not divisible by 10");
		}
	}
}
