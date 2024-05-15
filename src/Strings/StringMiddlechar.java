package Strings;

public class StringMiddlechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String a="orange";
           int len=a.length();
          int mid=len/2;
          if(len%2==0) {
       	      System.out.println(a.charAt(mid-1));
         }
       else {
       	  System.out.println(a.charAt(mid));
         }
           }
	}



