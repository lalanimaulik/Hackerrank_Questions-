import java.util.Scanner;


public class Cutting_Rod {

	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int rodLength[] = new int[n+1];
		int rodPrize[] = new int[n+1];
		
	
		for(int i=0;i<n;i++ ){
			
			rodLength[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++ ){
			
			rodPrize[i] = sc.nextInt();
		}
		int max =0; 
		int val[] = new int[n+1];
		val[0]=0;
		for(int i=1;i<=n;i++ ){
			max=0;
			for(int j=0;j<i;j++ ){
				
				max = Math.max(rodPrize[j]+ val[i-j-1],max);
				val[i] = max;
				
			}
		}
		
		System.out.print(max);
		
	}
	
}

