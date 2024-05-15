package Strings;

public class WordsHorizVertic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="selenium is an automation testing tool";
          String[] sc=s.split(" ");
          
          for(int i=0;i<sc.length;i++) {
        	  if(i%2==0) {
        		  System.out.println(sc[i]);
        	  }
        	  else {
        		  for(int j=0;j<sc[i].length();j++) {
        		  System.out.println(sc[i].charAt(j));
        	  }
          }
	}
	}
}
