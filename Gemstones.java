import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;


public class Gemstones {

	public static void main(String args[]){
		
		HashMap<Character,Integer> count_letter=new HashMap<Character,Integer>(); 
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		String[] s = new String[100] ;
		int count;
		for(int i=0;i<n;i++){
			
			s[i]= sc.next();
		}
		int result = 0;
		 for(char c='a'; c<='z';c++)
	        { int count1=0;
	        for(int j=0; j<n;j++)
	            {
	            if(s[j].contains(Character.toString(c)))
	                {
	                count1++;
	            }
	            else{
	                break;
	            }
	        }
	         if(count1==n)
	             {
	             result++;
	         }
	    }
		 
		 System.out.println(result);
			
	}
}
