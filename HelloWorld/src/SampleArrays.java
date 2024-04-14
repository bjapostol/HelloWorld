
public class SampleArrays {

	public static void main(String[] args) {

		int[] month_days = new int[12];

		month_days[0] = 31;
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 31;
		month_days[8] = 30;
		month_days[9] = 31;
		month_days[10] = 30;
		month_days[11] = 31;

		for (int i = 0; i < month_days.length; i++) {
			System.out.println("month " + (i + 1) + " " + month_days[i]);
		}

		int[] numbers = { 1, 2, 3, 4, 5 };

		for (int i : numbers) {
			System.out.print(i + " ");
		}

		System.out.println("-- Multidimensional Arrays --");

		// Demonstrate a two-dimensional array.

		int[][] twoD = new int[4][5];

		int x;
		int y;
		int z = 0;

		for (x = 0; x < 4; x++) {
			for (y = 0; y < 5; y++) {
				twoD[x][y] = z;
				z++;
			}
		}
		
		for (x = 0; x < 4; x++) {
			for (y = 0; y < 5; y++) {
				if (twoD[x][y] < 10) {
					System.out.print(" ");
				}
				System.out.print(twoD[x][y] + " ");
			}
			System.out.println();
		}
		
		// Sample 2 of Two-Dimensional Arrays
		
		int[][] twoD2 = new int[4][];
		
		twoD2[0] = new int[1];
		twoD2[1] = new int[2];
		twoD2[2] = new int[3];
		twoD2[3] = new int[4];
		
		z = 0;
		
		for (x = 0; x < 4; x++) {
			for (y = 0; y < x+1; y++) {
				twoD2[x][y] = z;
				z++;
			}
		}
		
		for (x = 0; x < 4; x++) {
			for (y = 0; y < x+1; y++) {
				System.out.print(twoD2[x][y] + " ");
			}
			System.out.println();
		}
	}

}
