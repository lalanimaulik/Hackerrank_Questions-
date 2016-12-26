import java.util.ArrayList;
import java.util.Scanner;


public class Palindrome_Index {

	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		ArrayList<Integer> finalArray = new ArrayList<Integer>();
		
		while(n>0){
		
			int answer =-1;
			n--;
			String s  =  sc.next();
			
			char c[] = s.toCharArray();
			
			for(int i=0, j=s.length()-1; i<s.length()/2;i++,j-- ){
				
				if(c[i]!= c[j]){
						
					if(c[i+1] == c[j]){
						answer = i;
						break;
					}
					else if(c[i] == c[j-1]){
						answer =j;
						break;
					}
				}
			}
			
			finalArray.add(answer);
		}
		
		for(int i=0;i<finalArray.size();i++){
			System.out.println(finalArray.get(i));
		}
	}
}
