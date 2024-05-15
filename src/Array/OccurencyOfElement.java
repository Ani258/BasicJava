package Array;

import java.util.Scanner;

public class OccurencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int arr[]={3,7,16,24,7,45,6,7,16};
	   int count=0; 
	   
	  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the element");
	   int element =sc.nextInt();
	   
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]==element) {
			   count++;
		   }
	   } 
	   System.out.println(element + " is occured at "+count+" times");
	}
}
