package in.training;

public class StudentDetails {
	String name;
	int age;
	static String college = "TKM";
	public static void main(String[] args) {
		System.out.println("STUDENT DETAILS\n");
		StudentDetails obj1=new StudentDetails("Gopika",26);
		//StudentDetails.college="TKM";
		obj1.display();
		obj1.dispcollege(college);
		StudentDetails obj2=new StudentDetails("Nazila",25);
		//StudentDetails.college="Rajadhani";
		obj2.display();
		obj2.dispcollege(college);
		StudentDetails obj3=new StudentDetails("Arjun",27);
		//StudentDetails.college="Alberts";
		obj3.display();
		obj3.dispcollege(college);

	}
	public void dispcollege(String company) {
		System.out.println("College : "+company);
	}
	
	StudentDetails(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("Name : "+name+"\nAge : "+age);
	}
}
