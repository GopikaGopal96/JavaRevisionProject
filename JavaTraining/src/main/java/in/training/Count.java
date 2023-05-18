package in.training;

class Count{
	public static void main(String []args){
		System.out.println("Count of Even and Odd numbers from 10 to 20:");
		int evencount=0;
		int oddcount =0;
		for(int i=10;i<=20;i++){
			if(i%2==0){
				evencount =evencount+1;
				}
			else{
				oddcount= oddcount+1;
				}
			}
		System.out.println("\nCount of even numbers : "+evencount);
		System.out.println("\nCount of odd numbers : "+oddcount);
		}
	}