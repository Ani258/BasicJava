package Array;

public class Fibnocis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=8;
          int f=0,s=1;
          System.out.println(+f+" "+s);
          int fibno;
          for(int i=2;i<=n;i++) {
        	fibno=f+s;
        	 System.out.println(fibno);
        	f=s;
            s=fibno;
           
           
        	
          }
	}

}
