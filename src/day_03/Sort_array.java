package day_03;

public class Sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {4,8,5,7,6};
         for(int i=0;i<arr.length;i++) {
        	 for(int j=i+1;j<arr.length;j++) {
        		 if(arr[i]>arr[j]) {
        			 int temp=arr[i];
        			 arr[i]=arr[j];
        			 arr[j]=temp; 
        		 }
        	 }
         }
         for(int k=0;k<arr.length;k++) {
        	 System.out.print(arr[k]+" ");
         }
	}

}
