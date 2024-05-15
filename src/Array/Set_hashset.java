package Array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<String> sc= new HashSet<String>();
        sc.add("ani");
        sc.add("makka");
        sc.add("narma");
        sc.add("");
        sc.add("");                     //print one space only bcz it accept non-duplicate
        
        System.out.println(sc);
        
        for(String s:sc) {
        	System.out.println(s);
        }
        
        Iterator<String> it=sc.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
	}

}
