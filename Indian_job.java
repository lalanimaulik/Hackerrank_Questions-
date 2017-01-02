import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;


public class Indian_job {

	public static void main(String args[]){
		
		
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int l=0;l<n;l++){
			
			int length =sc.nextInt();
			int time =sc.nextInt();
			
			int thief[] = new int[length];
			
			for(int i=0;i<length;i++){
				
				thief[i]= sc.nextInt();
			}
			Arrays.sort(thief);
			
			int temp[] = new int[time];
			int pointer =0;
			int flag=0;
			for(int i=length-1;i>=0;i--){
				int count=0;
				for(int j=0;j<time;j++){
					
					if(count==thief[i]){
						break;
					}
					if(temp[j]<2){
						count++;
						temp[j]++;
					}
					
				}
				if(count!=thief[i]){
					flag=1;
					break;
				}
			}
			if(flag==1){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
			}
		}
	}
	
}
