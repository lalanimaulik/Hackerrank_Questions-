import java.util.*;


public class Candy_piles {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] input = new int[n];
		
		for(int i=0;i<n;i++){
			
			input[i] = sc.nextInt();
		}
		
		Arrays.sort(input);
		int first[] = input;
		int ans1=0;
		int count=0;
		int num= 0;
		int temp=0;
		if(n>1){
			
			temp = input[0]*2;
			int y=0;
			if(temp>input[1]){
				num=input[1];
				y=1;
			}
			else{
				num = temp/2;
			}
			
			for(int i=0;i<n;i++){
				if(first[i]== num)
					count++;
			}
			
			input[0]= input[0]*2;
			
			Arrays.sort(input);
		
			ans1 = 0;	
			ans1 = input[0];
			
			
			
			
		}
		else{
			ans1 =0;
		}
		System.out.println(ans1 + " " + count);
		
		
	}
}
