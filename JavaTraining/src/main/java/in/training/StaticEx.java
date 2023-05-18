package in.training;
import java.util.Scanner;
public class StaticEx {
	public static void main(String []args){
		getName();
	}
	public static void getName(){
		System.out.println("Enter the name :");
		Scanner sc =new Scanner(System.in);
		String name = sc.next();
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		setName(name,age);
	}
	public static void setName(String name, int age){
		System.out.println("\nName : "+name+"\nAge : "+age);
		}
}
