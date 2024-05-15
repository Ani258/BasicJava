package Strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="race";
        String b="carE";
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] c=a.toCharArray();
        char[] d=b.toCharArray();
         
        if(a.length()==b.length()) {
        	Arrays.sort(c);
        	Arrays.sort(d);
        	boolean s=Arrays.equals(c,d);
        		 if(s==true){
        				System.out.println("anagram");
        			} 
        }
        else {
        	System.out.println("not a anagaram");
        }
	}
	}


