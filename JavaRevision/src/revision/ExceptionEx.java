package revision;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		int result;
		try {
			result = a/b;
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("You cannot divide a number by zero");
			System.out.println(e);
		}
		finally {
			System.out.println("Inside Finally block");
		}
	}

}
