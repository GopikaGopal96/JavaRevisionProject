package in.training;

public class Student {
	String name;
	int rollno;
	Address address;
	Student(String name, int rollno, Address address) {
		this.name =name;
		this.rollno = rollno;
		this.address = address;
	}
	public void display() {
		System.out.println("\nRoll No: "+rollno+"\nName: "+name);
		System.out.println("Address : "+address.city+" "+address.state+" "+address.country);
	}
	public static void main(String []args) {
		Address add1 = new Address("Cochin","Kerala","India");
		Student stud1 = new Student("Gopika",10,add1);
		stud1.display();
		Address add2 = new Address("Kollam","Kerala","India");
		Student stud2 = new Student("Nazila",17,add2);
		stud2.display();
	}
}
