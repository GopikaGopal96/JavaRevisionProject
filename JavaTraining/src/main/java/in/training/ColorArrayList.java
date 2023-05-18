package in.training;
import java.util.*;

public class ColorArrayList {
	public static void main(String []args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Yellow");
		list.add("Blue");
		list.add("Black");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
