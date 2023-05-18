package in.training;

public class PrintConst {
	public static void main(String args[]) {
		int n=0;
		PrintConst obj = new PrintConst(n);
	}
	PrintConst(int a){
		while(a<=10) {
			System.out.println(a);
			a++;
		}
	}
}
