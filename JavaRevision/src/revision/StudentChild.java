package revision;

public class StudentChild implements StudentEx{
	public void student() {
		System.out.println("Student name : Gopika");
	}
	public void print() {
		System.out.println("MEthid in class");
	}
	public static void main(String args[]) {
		//StudentChild obj = new StudentChild();
		//obj.student();
		//System.out.println("Rollno : "+rollno);
		StudentEx obj1 = new StudentChild();
		System.out.println("Roll no: "+StudentEx.rollno);
		StudentEx.display();
		obj1.student();
		//obj1.print();
	}
}
