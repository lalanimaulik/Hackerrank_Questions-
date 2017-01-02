import java.util.ArrayList;
import java.util.Scanner;


public class Stock_Maximize {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			
			int length = sc.nextInt();
			ArrayList<Integer> stockCount = new ArrayList<Integer>();
			int totalProfit = 0;
			for(int j=0;j<length;j++){
				
				stockCount.add(sc.nextInt());
			}
			int max=0;
			int shares=0;
			int spend = 0;
			
			for(int j=0;j<length;j++){
				
				totalProfit =0;
				shares=0;
				spend= 0;
				for(int k=0;k<j;k++){
					
					if(stockCount.get(j)> stockCount.get(k)){
						shares++;
						spend = spend+ stockCount.get(k);
					}
					else if (stockCount.get(j)< stockCount.get(k)){
						totalProfit=shares*stockCount.get(k) - spend;
						shares=0;
						spend=0;
					}
				}
				totalProfit = shares*stockCount.get(j) - spend +totalProfit;
				if(totalProfit>max){
					max = totalProfit;
				}
			}
			
			System.out.println(totalProfit);
		}
	}
}
