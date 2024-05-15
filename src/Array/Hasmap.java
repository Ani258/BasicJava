package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<Integer,String> m=new  HashMap<Integer,String>();
      m.put(01,"ani");
      m.put(02, "Aji");
      m.put(03, "thanish");
      System.out.println(m);
      
      for(Entry<Integer,String> es:m.entrySet()) {
    	  
      if(es.getValue().equalsIgnoreCase("aji")) {
    	  System.out.println(es.getKey());
      }
      System.out.println(es); 
      }
	}

}
