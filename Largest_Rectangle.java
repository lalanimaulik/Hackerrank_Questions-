import java.util.ArrayList;
import java.util.Scanner;


public class Largest_Rectangle {

	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		
		int n= sc.nextInt();
		
		ArrayList<Integer> a =new ArrayList<Integer>();
		
		
		for(int i=0;i<n;i++){
			
			a.add(sc.nextInt());
			
		}
		
		int max = 0;
		int temp=0;
		for(int i=0;i<n;i++){
		
			for(int j=0;j<n;j++){
			
				temp= a.get(i)*a.get(j);
				
				
				
			}
		}
		
	}
	
}
