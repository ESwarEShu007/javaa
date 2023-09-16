package basicprograms;
import java.util.*;
public class Hashset {
    Scanner scanner = new Scanner(System.in);

    // Read the number of entries in the phone book
    int n = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    // Create a HashMap to store the phone book entries
    Map<String, String> phoneBook = new HashMap<>();

    // Read and store the phone book entries
    for (int i = 0; i < n; i++) {
        String name = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        phoneBook.put(name, phoneNumber);
    }

    // Read queries until end-of-file
    while (scanner.hasNext()) {
        String query = scanner.nextLine();
        if (phoneBook.containsKey(query)) {
            String phoneNumber = phoneBook.get(query);
            System.out.println(query + "=" + phoneNumber);
        } else {
            System.out.println("Not found");
        }
    }

    scanner.close();
}

}
