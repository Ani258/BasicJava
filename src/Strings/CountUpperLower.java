package Strings;

public class CountUpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="AniTHarAdhA";
        int count=0,time=0;
        for(int i=0;i<a.length();i++) {
        	if(a.charAt(i)>='A'&&a.charAt(i)<='Z') {
        		count++;
        	}
        	else if(a.charAt(i)>='a'&&a.charAt(i)<='z'){
        		time++;
        	}
        }
        System.out.println(count);
        System.out.println(time);
	}

}
