package in.training;

public class FactNum {
	public static void main(String []args) {
		int num = 3;
		FactNum obj = new FactNum();
		obj.calc(num);
	}
	public void calc(int num) {
		int temp = num-1;
		for(int i=temp; i>0;i--) {
			num = num*i;
		}
		System.out.println(num);
		disp(temp+1,num);
	}
	public void disp(int tmp, int n) {
		System.out.println("Factorial of "+tmp+" is :"+n);
	}
}
