package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Integer> li=new ArrayList<Integer>();
         li.add(7);             //directly add value
         li.add(1, 6);          //add value with index
         
         List<Integer> a=Arrays.asList(2,90,8,5,76);
         
         System.out.println(li);
         System.out.println(a);
         
     
         for(int i:a) {
        	 System.out.println(i);
         }
         
         Iterator<Integer> it=li.iterator();
         while(it.hasNext()) {
        	 System.out.println(it.next());
         }
         
	}

}
