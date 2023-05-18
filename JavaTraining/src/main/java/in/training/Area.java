package in.training;
import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		System.out.println("Choose your option:\n1.Area of Circle\n2.Area of Rectangle\n3.Area of Square");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		Area obj = new Area();
		switch(opt) {
		case 1:
			double circ = obj.circle();
			System.out.println("\nArea of circle is "+circ);
			break;
		case 2:
			float rect = obj.rectangle();
			System.out.println("\nArea of rectangle is "+rect);
			break;
		case 3:
			int sq = obj.square();
			System.out.println("\nArea of square is "+sq);
			break;
		default:
			System.out.println("\nInvalid Option");
		}
	}
	public double circle() {
		double cirarea =0;
		System.out.println("\nEnter the radius ");
		Scanner sc1= new Scanner(System.in);
		double rad = sc1.nextFloat();
		cirarea = 3.14*rad*rad;
		return cirarea;
	}
	public float rectangle() {
		System.out.println("\nEnter the length and breadth: ");
		Scanner sc2 = new Scanner(System.in);
		float length = sc2.nextFloat();
		float breadth = sc2.nextFloat();
		float rectarea = length*breadth;
		return rectarea;
	}
	public int square() {
		System.out.println("\nEnter the side of square: ");
		Scanner sc3 = new Scanner(System.in);
		int side = sc3.nextInt();
		int sqarea = side*side;
		return sqarea;
	}
}
