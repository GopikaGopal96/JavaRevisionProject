package revision;

public class OverloadingEx {
	public void display(String name) {
		System.out.println("Name : "+name);
	}
	public void display(int age) {
		System.out.println("Age :"+age);
	}
	public void display(String city, String country) {
		System.out.println("City : "+city+"\nCountry: "+country);
	}
	public static void main(String[] args) {
		OverloadingEx obj = new OverloadingEx();
		obj.display("Gopika");
		obj.display(26);
		obj.display("Kochi","India");
	}

}
