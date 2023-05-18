package in.training;

public class Bank {
	private int pin[]= {1001,1234,1212};
	int flag =0;
	public void getPin(int userpin) {
		for(int i:pin) {
			if(i==userpin) {
				System.out.println("Valid pin");
				flag =1;
				break;
			}
		}
		if(flag==0) {
			setPin(userpin);
		}
	}
	public void setPin(int userpin) {
		System.out.println("Pin set successfully");
	}
}
