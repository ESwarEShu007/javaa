package basicprograms;
import java.util.*;

public class Anagaram {

    static boolean isAnagram(String a, String b) 
    {
                a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

                if (a.length() != b.length()) {
    
            return false;
                }
        int[] charCountA = new int[26]; // Assuming English alphabet
        int[] charCountB = new int[26];

        // Count character frequencies in string a
        for (char c : a.toCharArray()) {
            charCountA[c - 'a']++;
        }

        // Count character frequencies in string b
        for (char c : b.toCharArray()) {
            charCountB[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (charCountA[i] != charCountB[i]) {
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


