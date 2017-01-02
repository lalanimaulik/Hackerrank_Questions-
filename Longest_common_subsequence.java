import java.util.ArrayList;
import java.util.Scanner;


public class Longest_common_subsequence {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int str1[] =new int[n+1];
		int str2[] =new int[m+1];
		
		for(int i =1;i<=n;i++){
			
			str1[i]= sc.nextInt();
		}
		
		for(int i =1;i<m+1;i++){
			
			str2[i]= sc.nextInt();
		}
		
		int T[][] =new int[n+1][m+1];
		String sol[][] = new String[n+1][m+1];
		
		for(int i =1;i<=n;i++){
			for(int j =1;j<=m;j++){
				
				if(str1[i]==str2[j]){
					T[i][j] = T[i-1][j-1]+1;
					sol[i][j]= "diag";
				}
				else{
					T[i][j] = Math.max(T[i-1][j], T[i][j-1]);
					
					if(T[i][j]==T[i-1][j]){
						sol[i][j]= "top";
					}
					else{
						sol[i][j] = "left";
					}
				}
			}
		}
		int i = n;
		int j = m;
		
		ArrayList<Integer> finalAnswer = new ArrayList<Integer>();
		
		while(i>0 && j>0){
			
			if(sol[i][j]=="diag"){
				finalAnswer.add(str2[j]);
				i=i-1;
				j=j-1;
			}
			else if(sol[i][j]=="left"){
				j=j-1;
			}
			else if(sol[i][j]=="top"){
				i=i-1;
			}
		}
		
		for(int k= finalAnswer.size()-1;k>=0;k--){
		
			System.out.print(finalAnswer.get(k)+ " ");
		}
		
	}
}
