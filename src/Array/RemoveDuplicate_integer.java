package Array;

public class RemoveDuplicate_integer {

	public static void main(String[] args) {
		
//		Employee emp=new Employee();
//		emp.getData();
//	    emp.printData();
		
		int dup[] = {2,1,4,1,1,5,6,7,3,2,5};
		System.out.println("Non duplicate values: ");
		for(int i=0;i<dup.length;i++) {
			int count=0;
			for(int j=0;j<dup.length;j++) {
			if(dup[i]==dup[j]) {
				count++;	
			}
			}
			if(count==1) {
				System.out.print(dup[i] +" ");
			}
			}
	}
}
