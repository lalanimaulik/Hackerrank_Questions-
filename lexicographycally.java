import java.util.Scanner;


public class lexicographycally {

	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		String[] sarray = new String[100020];
		int n = sc.nextInt();
		int k; 
		for(k=1;k<=n;k++){
			
			String s = sc.next();
			int i=0,j=0, count = 0 ;
			char c[] = s.toCharArray();
			char temp;
			
			for(i=(c.length-1); i>0 ;i--){
				
				for(j=(c.length-2); j>=0;j-- ){
					
					if(c[i]>c[j]){
						temp = c[i];
						c[i]= c[j];
						c[j] = temp;
						count = 1;
						break;
					}
				}
				if(count ==1 ){
					break;
				}
			}
			int m=0,n1=0;
			String tempString= "";
			
			if(count ==1 && (i-j)>1){
				for(m=i; m>j ;m--){
					for(n1=m-1;n1>j;n1-- ){						
						if(c[m]<c[n1]){
							temp = c[m];
							c[m]= c[n1];
							c[n1] = temp;
						}
					}
				}
			}
			if(count==1){
				tempString = new String(c);	
			}
			else{
				tempString = new String("no answer");	
			}
			sarray[k] = tempString;
		}
		
		for(k=1;k<=n;k++){
			
			System.out.println(sarray[k]);
		}
	}
	
}
