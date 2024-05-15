package Array;

public class ArrayTransform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int []a= {3,6,7,12};
         int n=3;
         for(int j=1;j<=n;j++) {
         for(int i=0;i<a.length;i++) {
        	 if(a[i]%2==0) {
        		 a[i]=a[i]-3;
        	 }
        	 else {
        		 a[i]=a[i]+3;
        	 }
         }
         for(int k=0;k<a.length;k++) {
        	 System.out.print(a[k]);
         }
         System.out.println('\n');
	}
	}
}
