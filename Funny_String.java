import java.util.Scanner;


public class Funny_String {
	
	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		String[] finalResult = new String[111];
		
		for(int i=0;i<n;i++){
			
			String s= sc.next();
			
			char[] c= new char[10000];
			
			c= s.toCharArray();
			char[] c_inverted = new char[10000];
			
			for(int j=0;j<c.length;j++){
				
				c_inverted[c.length-j-1]= c[j];
			}
			String result = "Funny";
			
			int temp1,temp2;
			for(int j=0;j<(c.length-1);j++){
			
				temp1= c[j+1]- c[j];
				temp2= c_inverted[j+1]- c_inverted[j];
				
				if(Math.abs(temp1)==Math.abs(temp2)){
					continue;
				}
				else{
					result= "Not Funny";
					break;
				}
			}
			finalResult[i]= result;
		}
		
		for(int i=0;i<n;i++){
			System.out.println(finalResult[i]);
		}
	}
}
