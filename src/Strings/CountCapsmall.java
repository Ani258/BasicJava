package Strings;

public class CountCapsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="AniTHa";
        int count=0,time=0;
        for(int i=0;i<a.length();i++) {
        	if(Character.isLowerCase(a.charAt(i))) {
        		count++;
        	}
        	else if(Character.isUpperCase(a.charAt(i))){
        		time++;
        	}
        }
        System.out.println(count);
        System.out.println(time);
	}

}
