package in.training;
import java.util.*;
import java.util.Scanner;

public class RetrieveArrayList {
	public static void main(String []args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Yellow");
		list.add("Blue");
		list.add("Black");
		Iterator itr = list.iterator();
		System.out.println("Enter the position");
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		}
	}
