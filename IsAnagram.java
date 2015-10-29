import java.util.Scanner;
import java.util.Arrays;

public class IsAnagram {
	
	public static void main(String arg[]){
		boolean flag;
		flag=isAnagram("anagram","nagaram");
		System.out.println("the result -> " + flag);
		flag=isAnagram("rat","car");
		System.out.println("the result -> " + flag);
	}

	public static boolean isAnagram(String s, String t){
		if(s.length() > 128 || t.length() > 128){
			return false;
		}
		//int array index is num of each character
		Integer[] char_set = new Integer[128];
		for(int k=0; k<128;k++){
			char_set[k] = 0;
		}
		//occur a character, among the char_set position of this char add 1
		for(int i = 0; i < s.length(); i++){
			int val = s.charAt(i);
			char_set[val]++;
		}
		//occur a character, among the char_set position of this char sub 1
		for(int j = 0; j < t.length(); j++){
			int val = t.charAt(j);
			char_set[val]--;
		}
		//if char_set element is not 0,show this char count not same between the two string
		for(int l=0; l<128;l++){
			if(char_set[l] !=0 )
				return false;
		}
		return true;
	}
}