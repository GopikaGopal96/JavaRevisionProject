package in.training;

public class AvgAndArea {
	public static void main(String []args) {
		AvgAndArea obj = new AvgAndArea();
		obj.average(1, 2, 3);
		obj.average(1.2f,2.2f,3.1f);
		obj.area(2.0d);
		obj.area(5);
		obj.area(1.0d, 2.0d);
	}
	public void average(int a, int b, int c) {
		int avg = (a+b+c)/3;
		System.out.println("Average of three integers : "+avg);
	}
	public void average(float a, float b, float c) {
		float avg = (a+b+c)/3;
		System.out.println("\nAverage of three float numbers : "+avg);
	}
	public void area(double r) {
		double circle = 3.14*r*r;
		System.out.println("\nThe area of circle : "+circle);
	}
	public void area(int a) {
		int square = a*a;
		System.out.println("\nThe area of square : "+square);
	}
	public void area(double a, double b) {
		double rectangle = a*b;
		System.out.println("\nThe area of rectangle: "+rectangle);
	}
}
