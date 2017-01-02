import java.util.Scanner;


public class Lucky_Numbers {

	public static void main(String args[]){

		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		
		
		for(int i=0;i<n;i++){
			
			array[i] = sc.nextLong();
		}
		
		for(int i = 0;i<n;i++){
			
			long num = array[i];
			int temp=0;
			while(num%4 != 0 ){
				
				num = num-7;
				if(num==0){
					temp=1;
					break;
				}
				else if(num<0){
					break;
				}
			}
			
			if(temp==1 || (num%4 ==0 && num>0)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			
		}

	}
}
