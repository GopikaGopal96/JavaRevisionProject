package in.training;

	public class Calculate{
		float hra,pf;
		public void calc(float basicpay) {
			hra= (basicpay*5)/100;
			pf = (basicpay*20)/100;
			System.out.println("HRA: "+hra+"\nPF :"+pf);
		}

}
