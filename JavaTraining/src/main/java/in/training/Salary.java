package in.training;

public class Salary {
	public static void main(String []args) {
		Pay obj = new Pay();
		obj.getPay();
		Calculate obj2 = new Calculate();
		obj2.calc(obj.basic);
		Salary obj3 = new Salary();
		float totalsal = obj3.total(obj.basic, obj2.hra, obj2.pf, obj.deduction);
		obj3.printslip(obj.basic, obj.deduction,obj.bonus, obj2.hra,obj2.pf,totalsal);
	}
	public void printslip(float b, float d, float bo, float h, float p, float totalsal) {
		System.out.println(".....SALARY SLIP.....\n");
		System.out.println("Basic pay : "+b+"\nDeduction : "+d+"\nHRA : "+h+"\nPF : "+p+"\nBonus :"+bo+"\nTotal Salary :"+totalsal);
	}
	public float total(float b, float h,float p, float d) {
		float sal = b + h +p -d +b;
		return sal;
	}
}