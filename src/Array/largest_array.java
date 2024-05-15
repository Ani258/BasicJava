package Array;

public class largest_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {24,8,7,14,100,35};
          int larger=arr[0];
          for(int i=0;i<arr.length;i++) {
        	  if(arr[i]>larger) {
        		  larger=arr[i];
        	  }
          }
          System.out.println(larger);
       }
	}


