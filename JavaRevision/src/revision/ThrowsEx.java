package revision;

public class ThrowsEx {
	public static void main(String args[]) {
		ThrowEx.checkage(15);
	}
	public static void checkage(int age) {
		if (age>18) {
			System.out.println("Eligible for voting");
		}
		else {
			try {
				throw new License("Not eligible");
			} catch (License e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); // used for printing the message
			}
		}
	}
}
