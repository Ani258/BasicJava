package Array;

public class PrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
          for(int i=2;i<n;i++) {
        	  int temp=0;
        	  for(int j=2;j<i;j++) {
        	  if(i%2==0) {
        		  temp++;
        	  }
          }
        if(temp==0) {
        	System.out.println(i);
        }
        	  
	}
          

	} }
