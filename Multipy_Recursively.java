
public class Multipy_Recursively {

	public static void main(String args[]){
		
		int m=10;
		int n=-5;
		
		int ans = mult(m,n);
		
		System.out.println(ans);
	}
	
	public static int mult(int m,int n){
		 
		if(n==0){
			return 0;
		}
		else if(n>0){
			return (m+ mult(m,n-1) );
			
		}
		else if(n<0){
			return (-mult(m,-n));
			
		}
		return n;
	}
}
