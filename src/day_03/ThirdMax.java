package day_03;

import java.util.Arrays;

public class ThirdMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr = { 14, 3, 6, 24, 75, 8, 19,35,87};
		Arrays.sort(arr);
		
		for (int i =arr.length-1 ; i>=0; i--) {
			if(i==arr.length-3) {
				System.out.println(arr[i]);
				break;
			}
		}
       
	}

}
