
public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("--- Labels Demo ---");
		
		loop1: for (int i = 0; i < 5; i++) {
			System.out.println("counter i: " + i);
			loop2: for (int j = 0; j < 5; j++) {
				if (j >= 0  && j < 3) {
					System.out.println("continue loop 2 and valute of j is " + j);
					continue loop2;
				} else {
					System.out.println("break loop1");
					break loop1;
				}
			}
		}
		System.out.println("outside of loop");
		
	}
}
