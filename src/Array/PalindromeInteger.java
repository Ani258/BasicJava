package Array;

public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a=121;
          int rev=0;
          int original =a;
          while(a>0) {
        	 int rem=a%10;
        	  rev=rev*10+rem;
        	  a=a/10;
          }
          System.out.println(rev);
          if(original==rev) {
        	  System.out.println("a is palindrome");  
          }
          else {
        	  System.out.println("a is not palindrome");
          }
	}
	
}
