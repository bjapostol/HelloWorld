
public class HelloWorld {

	public static void main(String[] args) {

		String test = " GuEsT               ";

		String input = test;

		System.out.println(input);
		System.out.println(input.trim().toLowerCase().equals("admin"));

		if (input.equals("admin")) {
			System.out.println("Hello, Admin!");
		} else if (input.equals("guest")) {
			System.out.println("Hello, Guest!");
		} else {
			System.out.println("error");
		}
		
		System.out.println("New Merge");

	}
}