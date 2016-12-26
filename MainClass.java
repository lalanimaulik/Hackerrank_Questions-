import java.util.*;


public class MainClass {
	
	public static void main(String args[]){
		
		 HashMap<Character,Integer> count_letter=new HashMap<Character,Integer>(); 
		 
		 Scanner sc =new Scanner(System.in);
		 int n = sc.nextInt();
		 String c = sc.next();
		 char input[] = new char[n];
		 int count,temp=0,startValue=0,endValue=0;
		 input = c.toCharArray();
		 
		 for(int i=0;i<input.length;i++){
			 	
			if(count_letter.containsKey(input[i])){
				count= count_letter.get(input[i]);
				count_letter.put(input[i],(count+1));
			}
			else{
				count_letter.put(input[i],1 );
			}
		 }
		 System.out.println();
		 
		 for(int i=0;i<input.length;i++){
			 
			 count= count_letter.get(input[i]);
			 if(count>2 && temp==0){
				 temp=1;
				 startValue=i;
			 }
			 else if(count!=2){
				 endValue=i;
			 }
		 }
		 System.out.println(startValue);
		 System.out.println(endValue);
		 System.out.println(endValue-startValue+1);
	}
}
