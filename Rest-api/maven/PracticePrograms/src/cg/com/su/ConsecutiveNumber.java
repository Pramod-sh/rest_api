package cg.com.su;
/**
 *
 * @author pramoda.heremath
 *
 */

	public class ConsecutiveNumber {  
		
		public static boolean isPrime(int number) {  
			for(int j=2; j <= number/2; j++) {
			    if(number % j == 0){
				return false;
			
			    }
			}

		System.out.println(number + "is a Odd");
			return true;
		  }
		public static boolean isOdd(int n) {
		int b = -1;
		while(n>0)
		{
			int a = n % 10;
			if(b !=-1)
			{
				
				if(Math.abs(a-b)!= 1)
					return false;
			}
			n /= 10;
			b = a;
		  }
		return true;
		}
		public static void consecutiveNum(int x, int y) {
			for(int i=x; i<=y;i++)
				if(isOdd(i))
					System.out.println(i+"is Odd Prime Number");
		}
		
	   public static void main(String[] args) { 
		   int x=0;
		   int y=1000000;
		   consecutiveNum(x,y);

		   int range = 10000000;
		   int total_num = 0;
			for(int i = 1; i<10000000; i++) {
				if (isOdd(i)) {
					++total_num;
				}
			}
			System.out.println("Total number of Odd is:" + total_num);
			
		}
	   
	  } 

