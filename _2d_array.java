package basicprograms;
import java.util.*;
public class _2d_array {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read the input into a 2D array
    int[][] arr = new int[6][6];
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            arr[i][j] = scanner.nextInt();
        }
    }

    // Initialize the maximum sum with a minimum value
    int maxHourglassSum = Integer.MIN_VALUE;

    // Iterate through the 2D array to calculate the sum of each hourglass
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            // Calculate the sum of the current hourglass
            int hourglassSum =
                arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                arr[i + 1][j + 1] +
                arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

            // Update the maximum sum if the current hourglass has a larger sum
            maxHourglassSum = Math.max(maxHourglassSum, hourglassSum);
        }
    }

    // Print the maximum sum among all hourglasses
    System.out.println(maxHourglassSum);

    scanner.close();
}


}
