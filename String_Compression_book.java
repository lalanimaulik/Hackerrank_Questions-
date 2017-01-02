import java.util.ArrayList;
import java.util.Scanner;


public class String_Compression_book {

	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		String s = sc.next();
		
		char c[] =s.toCharArray();
		ArrayList<Character> result = new ArrayList<Character>();
		char temp =c[0];
		int counter =1;
		int pointer =0;
		int flag =0;
		for(int i=1;i<=c.length;i++){
			
			if(pointer==c.length){
				flag=1;
				break;
			}
			if(i==c.length){
				result.add( c[i-1]);
				pointer++;
				result.add(Integer.toString(counter).charAt(0));
				pointer++;
			}
			else if(temp==c[i]){
				counter++;
			}
			else{
				result.add(c[i-1]);
				pointer++;
				result.add(Integer.toString(counter).charAt(0));
				pointer++;
				counter =1;
				temp=c[i];
			}
				
		}
		if(flag==1){
			System.out.println(s);
		}
		else{
			System.out.println(result.toString());
		}
		
	}
}
