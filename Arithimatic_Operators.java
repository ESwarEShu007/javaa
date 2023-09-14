package basicprograms;
import java.util.*;

public class Arithimatic_Operators {


	    public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            
	            for(int i=0;i<3;i++){
	                String s1=sc.next();
	                int x=sc.nextInt();
	    String formattedString = String.format("%-14s %03d%n",s1, x);

	System.out.printf(formattedString);
	            }
	            sc.close();

	            System.out.println("================================");

	    }
	}



