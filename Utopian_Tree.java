import java.util.ArrayList;
import java.util.Scanner;


public class Utopian_Tree {

	public static void main(String args[]){
			
		Scanner sc =new Scanner(System.in);	
		
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList();
		int total =n;
		while(n>0){
			
			int m= sc.nextInt();
			
			int Height =1;
			for(int i=1;i<=m;i++){
				
				if(i%2==1){
					
					Height = Height*2;
					
				}
				else{
					Height = Height +1;
				}
				
			}
			a.add(Height);
			n--;
		}
		
		for(int i=0;i<total;i++){
			
			System.out.println(a.get(i));
		}
	}
}
