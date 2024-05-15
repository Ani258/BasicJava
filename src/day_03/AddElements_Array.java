package day_03;

import java.util.ArrayList;

public class AddElements_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // int arr[]= {1,5,6,8,4};
          ArrayList<Integer> a=new ArrayList<Integer>()	;
          a.add(1);
          a.add(2);
          a.add(3);
          a.add(7);
          a.remove(2);
          a.remove(Integer.valueOf(0));
          System.out.println(a);
          }
}
