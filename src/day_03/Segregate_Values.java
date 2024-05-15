package day_03;

public class Segregate_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a="abc20@gmail.com";
      StringBuffer number = new StringBuffer();
      StringBuffer letter = new StringBuffer();
      StringBuffer charactes = new StringBuffer();
      for(int i=0;i<a.length();i++) {
    	  
      if(Character.isDigit(a.charAt(i))) {
    	 number.append(a.charAt(i));
      }
      else if(Character.isAlphabetic(a.charAt(i))) {
    	  letter.append(a.charAt(i));
      }
      else 
      {
    	  charactes.append(a.charAt(i));
      }
	}
      System.out.println(letter);
      System.out.println(number);
      System.out.println(charactes);
	}
}
