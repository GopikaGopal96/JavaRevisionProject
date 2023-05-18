package revision;

public class ClassB extends ClassA{
	public void display() {
		//super.display();
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB obj = new ClassB();
		obj.display();
		
	}

}
