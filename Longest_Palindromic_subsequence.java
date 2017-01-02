import java.util.Scanner;


public class Longest_Palindromic_subsequence {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		
 		for(int i = 0; i<n ; i++){
 			
 			input[i] = sc.nextInt();
 		}
 		int[][] T = new int[n][n];
 		int length =1;
 		
 		for(int i =0;i<n;i++){
 			
 			T[i][i]=1;
 		}
 		
 		for(int i =2;i<=n;i++){
 			for(int j =0;(j+i-1)<n;j++){
 				if(input[j]== input[j+i-1]){
 					
 					T[j][j+i-1] = T[j+1][j+i-2]+2;
 				}
 				
 				else{
 					
 					T[j][j+i-1] = Math.max(T[j+1][j+i-1], T[j][j+i-2]); 
 				}
 			}
 		}
 		
 		int max = 0;
 		
 		for(int i =1;i<=n;i++){
 			
 		}
	}
}
