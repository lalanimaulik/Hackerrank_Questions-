import java.util.Scanner;


public class coin_change_hackerrank {

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int array[]= new int[m+1];
		
		for(int i=1;i<=m;i++){
			
			array[i] = sc.nextInt();
		}
		long T[][] = new long[m+n][n+4];
		for(int i=0;i<= m;i++){
			
			T[i][0] =1;
		}
		
		for(int i=1;i<= m;i++){
			for(int j=1;j<=n;j++){
				if(array[i]> j){
					T[i][j]= T[i-1][j];
				}
				else{
					T[i][j] = T[i][j-array[i]] + T[i-1][j];
				}
			}
		}
		System.out.println(T[m][n]);
	}
}
