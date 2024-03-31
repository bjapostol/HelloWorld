import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("This program will calculate the area of a triangle.");
		System.out.print("Please enter A side of the triangle: ");
		double aSide = scanner.nextDouble();
		
		System.out.print("Please enter B side of the triangle: ");
		double bSide = scanner.nextDouble();
		
		System.out.print("Please enter C side of the triangle: ");
		double cSide = scanner.nextDouble();
		
		double p = (aSide + bSide + cSide) / 2;
		double triangleArea = Math.sqrt(p * (p-aSide) * (p-bSide) * (p-cSide));
		
		System.out.println("The Area of the Triangle is: " + triangleArea);
	}
}
