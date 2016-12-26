import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Sparse_Array {
	
	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		HashMap<String,Integer> open_map=new HashMap<String,Integer>(); 
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		int value=0;
		for(int i=0;i<n;i++){
			
			String s = sc.next();
			if(open_map.containsKey(s)){
				value = open_map.get(s);
				open_map.put(s, value+1);
			}
			else{
				open_map.put(s,1);
			}
		}
		
		n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			
			String s = sc.next();
			if(open_map.containsKey(s)){
				
				value = open_map.get(s);
			}
			else{
				value=0;
			}
			output.add(value);
		}
		for(int i=0;i<output.size();i++){
			System.out.println(output.get(i));
		}
	}
}
