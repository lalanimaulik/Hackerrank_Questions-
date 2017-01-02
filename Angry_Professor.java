import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Angry_Professor {

	public static void main(String args[]){
		
		Stack<Character> st = new Stack();
		Scanner sc =new Scanner(System.in);
		
		int total = sc.nextInt();
		ArrayList<String> arrayResult = new ArrayList<String>();
		
		
		for(int j=0;j<total;j++){
			 st = new Stack();
			String s = sc.next();
			int flag = 0;
			char c[]=s.toCharArray();
			
			for(int i=0;i< c.length;i++){
				flag =0;
				if(c[i]=='{' || c[i]=='[' ||c[i]=='(' ){
	
					st.push(c[i]);
				}
				else if(c[i]=='}' || c[i]==']' ||c[i]==')' ){
					
					char c1=' ';
					if(!st.empty()){
						c1 = (Character) st.pop();
					}
					
					if((c1 == '(' && c[i] != ')') || (c1 == '{' && c[i] != '}') || (c1 == '[' && c[i] != ']') || c1==' '){
						
						flag =1 ;
						break;
					}
				}
			}
			if(!st.empty()){
				flag=1;
			}
			if(flag== 1){
				arrayResult.add("NO");
			}
			else{
				arrayResult.add("YES");
			}
		}
		
		for(int i=0;i< total;i++){
			System.out.println(arrayResult.get(i));
		}
		
	}
}
