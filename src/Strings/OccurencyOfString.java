package Strings;

public class OccurencyOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="anitharadha";
        int count =0;
        char ch='h';
        
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==ch) {
        		count++;
        	}
        }
        System.out.println(ch+" is occured at "+count+" times");
	}

}
