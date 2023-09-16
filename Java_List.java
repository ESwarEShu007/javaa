package basicprograms;
import java.util.*;
public class Java_List {
    Scanner scanner = new Scanner(System.in);

    // Read the initial number of elements in the list
    int n = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    // Create an ArrayList to represent the list
    ArrayList<Integer> list = new ArrayList<>();

    // Read the initial elements and add them to the list
    String[] elements = scanner.nextLine().split(" ");
    for (int i = 0; i < n; i++) {
        list.add(Integer.parseInt(elements[i]));
    }

    // Read the number of queries
    int q = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    // Process the queries
    for (int i = 0; i < q; i++) {
        String queryType = scanner.nextLine();
        if (queryType.equals("Insert")) {
            String[] insertQuery = scanner.nextLine().split(" ");
            int index = Integer.parseInt(insertQuery[0]);
            int value = Integer.parseInt(insertQuery[1]);
            list.add(index, value);
        } else if (queryType.equals("Delete")) {
            int index = Integer.parseInt(scanner.nextLine());
            list.remove(index);
        }
    }

    // Print the updated list
    for (int num : list) {
        System.out.print(num + " ");
    }

    scanner.close();
}

}
