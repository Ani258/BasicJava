package Strings;

public class RemoveDuplicate_string {
	
	public static String duplicate(String s) {
		
		String empty="";
		for(int i=0;i<s.length();i++) {
			if(!empty.contains(String.valueOf(s.charAt(i)))) {
				empty+=s.charAt(i);
			}
		}
		return empty;
	}
	public static void main(String args[]) {
		String s="capgemini";
		System.out.println(duplicate(s));
	}
}
