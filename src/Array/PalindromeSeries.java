package Array;

public class PalindromeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=150;
         for(int i=100;i<=a;i++) {
         int rev=0;
         int org=i;
         while(i>0) {
        	int rem=i%10;
        	rev=rev*10+rem;
        	i=i/10;	
         }
         i=org;
       if(rev==org) {
    	  System.out.println(org); 
       }
	}
	}
}
