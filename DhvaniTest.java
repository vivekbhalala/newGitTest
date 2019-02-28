import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class DhvaniTest {

	public DhvaniTest(){
		//git pull test
	}
	
	public static void main(String[] args) {
		int rangeLimit = 100000;
		Random randomNumber = new Random();
		int cValue = randomNumber.nextInt(rangeLimit);
		Scanner sc = new Scanner(System.in);
		//Using set to not count same attempts multiple times
		Set<Integer> set = new HashSet<Integer>();
		while (true) {
			System.out.println("Please enter number between 0 to 100");
			int gValue = sc.nextInt();
			if (gValue < 0 || gValue > rangeLimit) {
				System.out.println("Invalid input");
			} else if (gValue == cValue) {
				set.add(gValue);
				System.out.println("You Guessed it in " + set.size() + " steps");
				break;
			} else if (gValue < cValue) {
				set.add(gValue);
				System.out.println(gValue+" too small");
			} else if (gValue > cValue) {
				set.add(gValue);
				System.out.println(gValue+" too large");
			}

		}

		sc.close();

	}

}
