package Array;

public class RmvDupliUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {11,7,36,7,14,11,4};
        int visited=-1;
        for(int i=0;i<a.length;i++) {
        	if(a[i]!=-1) {
        	for(int j=i+1;j<a.length;j++) {
        		if(a[i]==a[j]) {
        			a[j]=visited;
        		}
        	}
        	System.out.println(a[i]);
        } 
	}
	}
}
