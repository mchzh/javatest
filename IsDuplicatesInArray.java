import java.util.Scanner;

//import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class IsDuplicatesInArray {
	
	public static void main(String arg[]){
		boolean flag;
		int[] array={0,0,12,0,1,1,1,1,3,4,0,0,0,8,9,0};
		int[] array1={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		flag = containsDuplicate(array);
		System.out.println("the result is -> " + flag);
		flag = containsDuplicate(array1);
		System.out.println("the result is -> " + flag);
	}

	public static boolean containsDuplicate(int[] nums){
		HashSet<Integer> set = new HashSet<Integer>();

		//iterator a time for array, then set has the element return true, set hasn't the element to add
		for(int i = 0; i < nums.length; i++){
			if( set.contains(nums[i])){
				return true;
			}else{
				set.add(nums[i]);
			}
		}
		return false;
	}
}
