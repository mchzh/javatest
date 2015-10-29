import java.util.Scanner;

//import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class IsTwoSumToTarget {
	
	public static void main(String arg[]){
		boolean flag;
		int[] array={0,0,12,0,1,1,1,1,3,4,0,0,0,8,9,0};
		int[] array1={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] array2={2,7,11,15};
		int length = array.length;
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int i = 0; i < length; i++){
			set1.add(array[i]);
		}
		Iterator iterator = set1.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		flag = twoSum(array,22);
		System.out.println("the result -> " + flag);
	}

	public static boolean twoSum(int[] nums, int target){
		HashSet<Integer> set = new HashSet<Integer>();
		int length = nums.length;
		
		//set used by an array of int
		for(int i = 0; i < length; i++){
			set.add(nums[i]);
		}
		//iterator set a time.If find a element in set which equal target sub the current elemtn's value,
		//return true.
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()){
			if( set.contains(target-iterator.next()) ){
				return true;
			}
		}
		return false;
	}
}
