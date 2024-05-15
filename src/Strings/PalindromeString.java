package Strings;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String a="Appa";
         String rev="";
         for(int i=0;i<a.length();i++) {
        	 rev=a.charAt(i)+rev;
         }
        	System.out.println(rev);
        if(rev.equalsIgnoreCase(a)) {
        	System.out.println("palindrome string");
        }
        else {
        	System.out.println("not palindrome");
        }
	}
}	
