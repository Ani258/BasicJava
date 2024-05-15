package Array;

public class Pryamid_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("**************");
		for(int i=n;i>0;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
