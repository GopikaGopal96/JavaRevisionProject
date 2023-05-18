package revision;

public class ThrowEx {
	public static void main(String args[]) {
		ThrowEx.checkage(15);
	}
	public static void checkage(int age) {
		if (age>18) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new ArithmeticException("Not eligible");
		}
	}
}
