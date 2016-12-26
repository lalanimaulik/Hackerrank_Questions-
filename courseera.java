import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class courseera {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		//int array[] = {5,4,4,2,2,8}; 
		ArrayList<Integer> array= new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(1);
	
		
		getResult(array);
		
	}
	
	public static ArrayList<Integer> getResult(ArrayList<Integer> array ){
		
		ArrayList<Integer> resultArray= new ArrayList<Integer>();
		
		
		Collections.sort(array);
		int zeroCount = 0;
		
		while(zeroCount< array.size()){
			
			int min = array.get(0);
			int totatIncrement =0;
			zeroCount = 0;
			
			for(int i=0;i<array.size();i++){
				
				if(array.get(i)>0){
					totatIncrement++;
					array.set(i,array.get(i)- min);
				}
				else {
					
					zeroCount++;
				}
			}
			
			while(array.size()>0 && array.get(0)==0){
			
					array.remove(0);
			}
			resultArray.add(totatIncrement);
			
			
		}
		System.out.println(resultArray);
		return resultArray;
		
	}
	
	
	public static int getMin(ArrayList<Integer> a){

		int min =0; 
		
		for(int i=0;i<a.size();i++){
			
			if(a.get(i)<min && a.get(i)!= 0){
				
				min = a.get(i); 
			}
		}
		
		
		
		return min;
	}
	
	
}
