import java.util.ArrayList;
import java.util.Scanner;


public class WeekOfCode_Sets {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		ArrayList<Integer> array1= new ArrayList<Integer>();
		ArrayList<Integer> array2= new ArrayList<Integer>();
		ArrayList<Integer> factorsfirst= new ArrayList<Integer>();
		
		for(int i = 0;i< n1;i++){
			
			array1.add(sc.nextInt());	
			
		}
		
		for(int i = 0;i< n2;i++){
			
			array2.add(sc.nextInt());	
			
		}
		
		int startValue = array2.get(0) ; 
		for(int i =2 ;i<= startValue; i++){
			
			if(startValue%i==0){
					factorsfirst.add(i);
			}
		}
		
		for(int i = 0 ;i< array2.size();i++){
			
			for(int j = 0 ;j< factorsfirst.size();j++){
				
				if((array2.get(i))%(factorsfirst.get(j))!=0){	
					factorsfirst.remove(j);
				}	
			}
		}
		
		for(int i = 0 ;i< array1.size();i++){
			
			for(int j = 0 ;j< factorsfirst.size();j++){
				
				if((factorsfirst.get(j)%(array1.get(i)))!=0 || (factorsfirst.get(j)<=(array1.get(0)))){	
					factorsfirst.remove(j);
					j=0;
				}	
			}
		}
		System.out.println(factorsfirst.size());
	}
}
