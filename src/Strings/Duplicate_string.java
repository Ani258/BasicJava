package Strings;

public class Duplicate_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String a="anitiha";
         String b="java is a programming language";
       //  char empty[] = new char[a.length()];
       //  String ch=b.replaceAll("//s+","");
        // char[] n=b.toCharArray();
         
         char[] c=a.toCharArray();
         for(int i=0;i<a.length();i++) {
        	for(int j=i+1;j<a.length();j++) {
        		if(c[i]==c[j]) {
        		
     			System.out.print(c[i]);
        		}
        		
        	}
         }
	}

}
