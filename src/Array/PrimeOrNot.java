package Array;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=7;
 		int temp=0;
 		for(int i=2;i<=9;i++) {
 			if(a!=i) {
 		if(a%i==0) {
 			System.out.println(a + "is not a prime");
 			temp++;
 			break;
 		}
 		}
 	}
 		if(temp==0) {
 			System.out.println(a + "is a prime");
 			
 		}
         
	}

}
