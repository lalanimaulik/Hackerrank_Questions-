import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Sherlock_anagrams {

	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
			
		int n = sc.nextInt();
		ArrayList<Integer> finalResult= new ArrayList<Integer>();
		
		for(int z=0;z<n;z++){
			
			HashMap<String,Integer> count_letter=new HashMap<String,Integer>(); 
		
			int i,j;
			String input_string = sc.next();
			String input_char;
			String input_sorted;
			
			for(j=1;j<input_string.length();j++){
				for(i=0;(i+j)<=input_string.length();i++){
					
					input_char = input_string.substring(i, i+j);
					input_sorted = sort(input_char);
					int count=0;
					if(count_letter.containsKey(input_sorted)){
						count = count_letter.get(input_sorted);
						count_letter.put(input_sorted, count+1);
					}
					else{
						count_letter.put(input_sorted, 1);
					}
				}
			}
			int finalCount =0;
			Collection<Integer> c= count_letter.values();
			Iterator<Integer> map = c.iterator();
			
			while(map.hasNext()){
				
				int value = (Integer) map.next();
				if(value>1){
					if(value>2){
						finalCount = finalCount + value;
					}
					else if(value==2)
						finalCount = finalCount + 1;
				}
			}
			finalResult.add(z,finalCount);
		}
		
		for(int y=0;y<finalResult.size();y++){
			
			System.out.println(finalResult.get(y));
			
		}
	}
	
	public static String sort(String s){
		
	        char[] chars = s.toCharArray();
	        Arrays.sort(chars);
	        String sorted = new String(chars);
		return sorted;
	}
	
	public static int combination(int n, int k)
	{
	    return permutation(n) / (permutation(k) * permutation(n - k));
	}
	
	public static int permutation(int i)
	{
	    if (i == 1)
	    {
	        return 1;
	    }
	    return  (i * permutation(i - 1));
	}
}
