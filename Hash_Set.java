package basicprograms;
import java.util.*;
public class Hash_Set {
	

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        String[] pair_left = new String[t];
	        String[] pair_right = new String[t];

	        for (int i = 0; i < t; i++) {
	            pair_left[i] = s.next();
	            pair_right[i] = s.next();
	        }

	        // Create a set to store unique pairs
	        Set<String> uniquePairs = new HashSet<>();

	        // Iterate through the pairs and add them to the set
	        for (int i = 0; i < t; i++) {
	            String pair = pair_left[i] + " " + pair_right[i];
	            uniquePairs.add(pair);
	            System.out.println(uniquePairs.size());
	        }
	    }
	}



