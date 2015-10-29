import static org.junit.Assert.*;

import org.junit.Test;

public class IsAnagramTest {

	@Test
	public void testIsAnagram() {
		//fail("Not yet implemented");
		String s1 = "anagram";
		String s2 = "rat";
		String t1 = "nagaram";
		String t2 = "car";
		assertTrue(IsAnagram.isAnagram(s1, t1));
		assertTrue(IsAnagram.isAnagram(s2, t2));
	}

}
