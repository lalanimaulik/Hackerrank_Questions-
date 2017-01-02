import java.util.Scanner;


public class Maximum_Subarray_hackerrank {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] finalConti  = new int[n];
		int[] finalNon  = new int[n];
		
		
		for(int k =0;k<n;k++){
			
			int length = sc.nextInt();
			
			int[] array = new int[length];
			int temp[] = new int[length];
			
			for(int i=0; i<length;i++){
				
				array[i] = sc.nextInt();
				temp[i] = array[i];
			}
			
			for(int i=0;i<length-1;i++){
				
				if(temp[i]+temp[i+1]>temp[i+1]){
					temp[i+1] = temp[i]+ temp[i+1];
					
				}
			}
			
			int nonsum= 0;
			
			for(int i=0;i<length;i++){
				
				if(array[i]>0){
					nonsum = nonsum+array[i];
				}
				
			}
			int min = array[0];
			if(nonsum == 0){
				
				for(int i=1; i<length;i++){
					
					if(array[i]>min){
						min =temp[i];
						
					}
				}
				nonsum=min;
			}
			
			finalNon[k]= nonsum;
			int max =temp[0];
			for(int i=1; i<length;i++){
				
				if(temp[i]>max){
					max =temp[i];
					
				}
			}
			finalConti[k]= max;
			
		}
		
		for(int i=0; i<n;i++){
			
			System.out.print(finalConti[i]+ " ");
			System.out.println(finalNon[i]);
		}
	}
}
