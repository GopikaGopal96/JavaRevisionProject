package in.training;
class AddMatrix{
	public static void main(String []args){
		int firstm[][] ={{0,0,1},{1,0,0},{0,1,0}};
		int secondm[][] ={{1,1,1},{1,2,3},{1,0,2}};
		int sum[][] = new int[3][3];
		System.out.println("The sum matrix is:\n");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
					sum[i][j]=firstm[i][j]+secondm[i][j];
					System.out.print(sum[i][j]+" ");
				}
			System.out.println("\n");
			}
		}
	}