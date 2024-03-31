import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	static int number;
	static List<Integer> primeNumbers = new ArrayList<>();

	public static List<Integer> checkPrimeNumbers() {
		for (int numberToCheck = 2; numberToCheck <= number; numberToCheck++) {
			boolean isPrime = true;
			for (int factor = 2; factor <= (numberToCheck / 2); factor++) {
				if (numberToCheck % factor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeNumbers.add(numberToCheck);
			}
		}
		return primeNumbers;
	}

}
