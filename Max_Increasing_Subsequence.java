import java.util.ArrayList;
import java.util.Scanner;


public class Max_Increasing_Subsequence {

	public static void main(String args[]){
			
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int T[] =new int[n];
		int result[] = new int[n];
		int sequence[] = new int[n];
		
		for(int i =0;i<n;i++){
			T[i]= sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			
			result[i] = T[i];
			sequence[i] = i;
		}
		
		
		for(int i =1;i<n;i++){
			for(int j =0;j<i;j++){
				
				if(T[i]>T[j]){
					
					result[i] = Math.max(result[j]+T[i], result[i]);
					
					if(result[i]== result[j]+T[i]){
						sequence[i] = j;
					}
				}
				
			}
		}
		
		int max=0,maxIndex =0;
		for(int i =0;i<n;i++){
			
			if(result[i]>max){
				
				max = result[i];
				maxIndex = i;
			}
			
		}
		ArrayList<Integer> finalAnswer = new ArrayList<Integer>();
		int temp = maxIndex;
		int flag = 0;
		int i =1;
		while(i==1){
			
			if(temp==0){
				flag =1;
			}
			finalAnswer.add(T[temp]);
			temp = sequence[temp];
			if(flag==1 && temp ==0){
				break;
			}
		}
		System.out.println(max);
	}
}
