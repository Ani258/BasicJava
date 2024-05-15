package day_03;

public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a=456;
          int rev=0;
          while(a!=0) {
        	 int rem=a%10;
        	  rev=rev*10+rem;
        	  a=a/10;
          }
          System.out.println(rev);
          if(a==rev) {
        	  System.out.println("a is palindrome");  
          }
          else {
        	  System.out.println("a is not palindrome");
          }
	}

}
