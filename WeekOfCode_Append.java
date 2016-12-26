import java.util.Scanner;


public class WeekOfCode_Append {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		int k = sc.nextInt();
		
		char[] cs = s.toCharArray();
		char[] ct = t.toCharArray();
		
		int slength = s.length();
		int tlength = t.length();
		int small=0;
		int large=0;
		
		if(tlength>slength){
			
			small= slength;
			large= tlength;
			
		}
		else{
			
			small= tlength;
			large= slength;
		
		}
		int i,count=0;

		for(i=0;i<small;i++){
			
			if(cs[i]!=ct[i]){
				break;
			}
			else{
				count++;
			}
		}
		
		int deleteOpt= large-count;
		int addOpt= small-count;
		String resultString = null;
		
		
		if(count==0){
			
			if(k>=large+small){
				resultString= "Yes";
			}
			else{
				resultString= "No";
			}
			
		}
		else{
			
			if(deleteOpt+addOpt==k || k>=large+small){
				resultString = "Yes";
			}
			else if(count==large){
				if(2*k>=count){
					resultString= "Yes";
				}
				else if(k/2==0 && k!=1){
					resultString= "Yes";
				}
				else{
					resultString= "Yes";
				}
			}
			else{
				resultString = "No";
			}
		}
		System.out.println(resultString);
		
	}
	
}
