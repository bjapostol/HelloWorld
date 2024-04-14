
public class MethodDemo {

	public static void main(String[] args) {
		int sum = sum(1,3);
		printToConsole(sum);
		printToConsole(sum(2.1,3.4));
		printToConsole("Some text");

	}
	
	private static int sum(int num1, int num2) {
		return num1 + num2;
		
	}
	
	private static double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	private static void printToConsole(String text) {
		System.out.println(text);
	}
	
	private static void printToConsole(int i) {
		System.out.println(i);
	}
	
	private static void printToConsole(double i) {
		System.out.println(i);
	}

}
