package in.training;

public class OffSeason {
	int amount,discountamt;
	public int discount(int price) {
		discountamt=(price*15)/100;
		amount = price-discountamt;
		return amount;
	}
}
