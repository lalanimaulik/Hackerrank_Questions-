import java.util.Scanner;


public class Coin_Sum {
	
	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		int coins[] = new int[n];
		
		for(int i=0;i<n;i++){
			
			coins[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		int coinCount[] = new int[sum+2];
		int tempSum=0;
		for(int i=0;i<n;i++){
			
			for(int j=0;j<=sum;j++){
				
				tempSum = j+ coins[i];
				
				if(tempSum<=sum){
					if(coinCount[tempSum]==0){
						coinCount[tempSum] = coinCount[j]+1;
					}
					else if(coinCount[tempSum]> (coinCount[j]+1)){
						coinCount[tempSum] = coinCount[j]+1;
					}
				}
			}
		}
		
		System.out.println(coinCount[sum]);
	}
}