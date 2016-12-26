import java.util.Scanner;


public class RichieRich {

	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int change = sc.nextInt();
		
		String number = sc.next();
		
		char c[] =number.toCharArray();
		int count =0 ;
		int output=0;
		for(int i=0,j= (n-1); i<n/2;i++,j--){
			if(c[i]!= c[j]){
				count++;
			}
		}
		
		if(n==1 && change >0){
			
			System.out.println(9);
		}
			
		else if(count > change){
			System.out.println(-1);
		}
		else if(count == change){
			for(int i=0,j= (n-1); i<n/2;i++,j--){
				if(c[i]!= c[j] && c[i]> c[j]){
					c[j]=c[i];
				}
				else{
					c[i]=c[j];
					
				}
			}
			System.out.println(c);
		}
		else{
			for(int i=0,j= (n-1); i<n/2;i++,j--){
				if(c[i]!= c[j] && change>count){
					c[j]='9';
					c[i]='9';
					change =change-2;
					count--;
				}
				if(c[i]!= c[j] && c[i]> c[j]){
					c[j]=c[i];
					change --;
				}
				else if(c[i]!= c[j] && c[i]< c[j]) {
					c[i]=c[j];
					change--;
				}
			}
			for(int i=0,j= (n-1); i<n/2;i++,j--){
				if(change >0 && c[i]!='9'  ){
					c[i]='9';
					c[j]='9';
					change =change -2;
				}
				
			}
			
			
			System.out.println(c);
		}
		
	}
}
