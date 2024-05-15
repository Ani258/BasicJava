package Array;

public class MultipleNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=632;
         int mul=1;
         while(n>0) {
        	 int rem=n%10;
        	 mul=rem*mul;
        	  n=n/10;
        	
         }
         System.out.println(mul);
         
	}

}
