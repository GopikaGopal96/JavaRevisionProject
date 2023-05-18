package in.training;

public class ChildSub {
	int sub;
	public void sub(int a,int b) {
		sub = a-b;
		System.out.println("The result is "+sub);
	}
	public static void main(String []args) {
		ChildSub obj= new ChildSub();
		ParentAdd obj1 =new ParentAdd();
		obj1.add();
		obj.sub(obj1.num1,obj1.num2);
		
	}
}
