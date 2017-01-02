import java.util.ArrayList;
import java.util.Scanner;


public class Longest_Increasing_Subsequence {
	
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int number[] =new int[n];
		
		for(int i=0;i<n;i++){
			
			number[i]= sc.nextInt();
		}
		ArrayList<Integer> subsequence = new ArrayList<Integer>();
		
		
		for(int i=0;i<n;i++){
			
			subsequence.add(i,1);
		}
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				
				if(number[i]>number[j] && subsequence.get(i)< subsequence.get(j)+1){
					subsequence.set(i,subsequence.get(j));
					
				}
			}
			int temp = subsequence.get(i);
			subsequence.set(i, temp+1);		
		}
		int max =0;
		for(int i=1;i<n;i++){
			
			if(subsequence.get(i)>max)
				max = subsequence.get(i);
		}
		System.out.println(max);
	}
}
