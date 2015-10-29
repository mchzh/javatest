import java.util.Scanner;
import java.util.Arrays;

public class MoveZeroToEnd {
	
	public static void main(String arg[]){
		int[] array={0,0,12,0,1,1,1,1,3,4,0,0,0,8,9,0,0,0,0,11,0,12,34};
		moveZeroes(array);
	}

	public static void moveZeroes(int[] nums){
		int moveposi = 0;
		//encounter non-0 value to fill in the increment sequence
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != 0){
				nums[moveposi] = nums[i];
				moveposi++;
			}
		}
		//rest of array to fill full 0
		for(int j = moveposi; j < nums.length; j++){
			nums[j] = 0;
		}
		String intArrayString = Arrays.toString(nums); 
		System.out.println("convert arrsy -> " + intArrayString);
	}
}