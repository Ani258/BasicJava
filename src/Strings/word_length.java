package Strings;

public class word_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a ="anitha";
        char[] ch=a.toCharArray();
        int count =0;
        System.out.println(a.length());
        for(char cha:ch){
        	count++;
        }
        System.out.println(count);     //without using length()function
        
	}

}
