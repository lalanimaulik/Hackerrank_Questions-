import java.util.*;

public class Truck_Tour {

	public static void main(String args[]){
		
		
	    Scanner sc =new Scanner(System.in);
	   
	    int n= sc.nextInt();
	    ArrayList<Integer> petrol = new ArrayList<Integer>();
	    ArrayList<Integer> distance = new ArrayList<Integer>();
	    int size =n;
	    //enqueue the values
	    while(n>0){
	    	
	    	n--;
	    	int p= sc.nextInt();
		    int d= sc.nextInt();
	    	
		    petrol.add(p);
		    distance.add(d);
	    	
	    }
	    int count = 0;
	    int total = 0;
	    for(int i=0 ;i< size;i++){
	    	
	    	total = total + (petrol.get(i) - distance.get(i));
	    	
	    	if(total<0){
	    		total=0;
	    		count=i+1;
	    	}
	    
	    }
	    
	    System.out.println(count);
	}
}


	
	