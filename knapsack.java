import java.util.Scanner;


public class knapsack {
	
	public static void main(String args[]){
			
		Scanner sc =new Scanner(System.in);
		int[] weight = new int[5];
		int[] value = new int[5];
		
		
		weight[0] = 0;
		value[0] = 0;
		int n = sc.nextInt() ;
		int[][] T = new int[5][n+1];
		for(int i=1;i<=4;i++){
			
			weight[i] = sc.nextInt();
		}
		for(int i=1;i<=4;i++){
			value[i]= sc.nextInt();
			
		}
		for(int i=1;i<=4;i++){
			for(int j=1;j<=n;j++){
				
				if(weight[i]>j){
					T[i][j]= T[i-1][j];
				}
				else{
					T[i][j] = Math.max( T[i-1][j], value[i] + T[i-1][j- weight[i]]);
					
				}
			}
		}
		
		
		
	}
}
