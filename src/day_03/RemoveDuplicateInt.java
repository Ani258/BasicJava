package day_03;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,9,6,7,24,15,9,6};
		Set hash = new HashSet();
		for(int i=0;i<arr.length;i++) {
			hash.add(arr[i]);
		}
		System.out.println(hash);

	}

}
