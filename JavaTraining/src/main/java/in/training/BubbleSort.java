package in.training;

public class BubbleSort {
	public static void main(String []args) {
		int arr[]= {10,3,5,4,6,7,1,8,2,9};
		int temp=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++){
				if(arr[i]<=arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The sorted array is :\n");
		for(int k=0;k<10;k++) {
			System.out.print(arr[k]+" ");
		}
	}
}
