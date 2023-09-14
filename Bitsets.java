package basicprograms;
import java.util.*;
public class Bitsets {

	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        int M = scanner.nextInt();
	        
	        BitSet B1 = new BitSet(N);
	        BitSet B2 = new BitSet(N);
	        
	        for (int i = 0; i < M; i++) {
	            String operation = scanner.next();
	            int set = scanner.nextInt();
	            int index = scanner.nextInt();
	            
	            if (set == 1) {
	                performOperation(B1, B2, operation, index);
	            } else if (set == 2) {
	                performOperation(B2, B1, operation, index);
	            }
	            
	            System.out.println(B1.cardinality() + " " + B2.cardinality());
	        }
	        
	        scanner.close();
	    }
	    
	    private static void performOperation(BitSet target, BitSet other, String operation, int index) {
	        switch (operation) {
	            case "AND":
	                target.and(other);
	                break;
	            case "OR":
	                target.or(other);
	                break;
	            case "XOR":
	                target.xor(other);
	                break;
	            case "FLIP":
	                target.flip(index);
	                break;
	            case "SET":
	                target.set(index);
	                break;
	            default:
	                System.out.println("Invalid operation");
	                break;
	        }   }
	}


