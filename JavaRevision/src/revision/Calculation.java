package revision;

public class Calculation {
		static int add;
		int diff;
	Calculation(int a, int b){
		diff = a-b;
	}
	public int add (int a, int b) {
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
		Calculation cal = new Calculation(10,5);
		Calculation.add = cal.add(20, 10);
		System.out.println("Sum :"+add);
		System.out.println("Difference : "+cal.diff);
	}

}
