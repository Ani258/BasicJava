package Array;

public class Reverser_particularPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[]= {1,2,3,4,5,6,7};
          for(int i=0;i<=a.length;i++) {
        	 if(i<4) {
        		 
        		   for(i=3;i>=0;i--) {
        		   System.out.print(a[i]);
        		  }
        		   break;
        	}
        	  }
         for(int j=4;j<a.length;j++) {
        	 System.out.print(a[j]);
         }
          }
	}

