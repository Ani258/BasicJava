package Strings;

public class Compare_Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aniha";
		char[] c=a.toCharArray();
		String b="anith";
		char[] d=b.toCharArray();
		if(a.length()!=b.length()) {           //check the length of string 
		         System.out.println("not equal");
		         return;
		}
			for(int i=0;i<a.length();i++) {     //traverse the string and compare two strings
				if(c[i]!=d[i]) {
					System.out.println("not equal");
					return;
				}
			}
	      System.out.println("equal"); 
	}
	} 

			
	
			
	
	


