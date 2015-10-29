import static org.junit.Assert.*;

import org.junit.Test;

public class IsTwoSumToTargetTest {

	@Test
	public void testTwoSum() {
		//fail("Not yet implemented");
		int[] array={0,0,12,0,1,1,1,1,3,4,0,0,0,8,9,0};
		int[] array1={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] array2={2,7,11,15};
		int target1 = 9;
		int target2 = 10;
		assertTrue(IsTwoSumToTarget.twoSum(array2, target1));
		assertTrue(IsTwoSumToTarget.twoSum(array2, target2));
	}

}
