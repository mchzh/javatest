import java.util.*;

public class PrintCorreChar {
	
	public static void main(String arg[]){
		testPrint();
	}

	public static void testPrint() {
		System.out.println("Input a number -> ");
		Scanner in = new Scanner(System.in); 
		int number = in.nextInt();
		printFizzBuz(number);
		while( number != -1){
			System.out.println("Input a number -> ");
			number = in.nextInt();
			printFizzBuz(number);
		}
	}

	public static void printFizzBuz(int n){
		if(n == 0){
			System.out.println("Input is Zero -> fizz buzz");
		}else{
			if((n%3 == 0) && (n%5 == 0)){
				System.out.println("fizz buzz");
				return;
			}
			
			if(n%3 == 0){
				System.out.println("fizz");
				return;
			}
			
			if(n%5 == 0){
				System.out.println("buzz");
				return;
			}
		}
	}
}
