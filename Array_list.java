package basicprograms;
import java.util.*;
public class Array_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an ArrayList of ArrayLists to store the lines
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        // Read the lines and store them in ArrayLists
        for (int i = 0; i < n; i++) {
            String[] lineValues = scanner.nextLine().split(" ");
            int numValues = Integer.parseInt(lineValues[0]);
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 1; j <= numValues; j++) {
                line.add(Integer.parseInt(lineValues[j]));
            }
            lines.add(line);
        }

        // Read the number of queries
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Process the queries
        for (int i = 0; i < q; i++) {
            String[] query = scanner.nextLine().split(" ");
            int x = Integer.parseInt(query[0]) - 1; // Adjust for 0-based indexing
            int y = Integer.parseInt(query[1]) - 1; // Adjust for 0-based indexing

            // Check if the line and position exist
            if (x >= 0 && x < lines.size() && y >= 0 && y < lines.get(x).size()) {
                System.out.println(lines.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }


}
