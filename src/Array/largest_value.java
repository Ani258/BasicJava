package Array;

import java.util.Arrays;

public class largest_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {17,4,89,6,25,100,53};

        Arrays.sort(arr);
    
       for(int j=arr.length-1;j>=0;j--) {
    	
    	   if(j==arr.length-1) {
    		  System.out.println(arr[j]); 
    		  break;
    	   }
       }
	}

}
