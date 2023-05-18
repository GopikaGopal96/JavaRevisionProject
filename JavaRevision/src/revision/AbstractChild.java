package revision;

public class AbstractChild extends AbstractEx{
	@Override
	public void display() {
		System.out.println("Abstract body");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj = new AbstractChild();
		obj.display();
		obj.print();
	}

}
