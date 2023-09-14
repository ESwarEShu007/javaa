package basicprograms;
import java.util.*;
public class String_Tokens {


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        scan.close();
	        int length = s.length();
	        boolean inWord = false;
	        int tokenCount = 0;

	        for (int i = 0; i < length; i++) {
	            char c = s.charAt(i);

	            if (Character.isLetter(c)) {
	                if (!inWord) {
	                    inWord = true;
	                    tokenCount++;
	                }
	            } else {
	                inWord = false;
	            }
	        }

	        System.out.println(tokenCount);

	        inWord = false;
	        StringBuilder currentWord = new StringBuilder();

	        for (int i = 0; i < length; i++) {
	            char c = s.charAt(i);

	            if (Character.isLetter(c)) {
	                currentWord.append(c);
	                inWord = true;
	            } else {
	                if (inWord) {
	                    System.out.println(currentWord.toString());
	                    currentWord = new StringBuilder();
	                }
	                inWord = false;
	            }
	        }

	        if (inWord) {
	            System.out.println(currentWord.toString());
	        }

	    }
	}

