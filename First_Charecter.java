package basicprograms;
import java.util.*;
public class First_Charecter {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int count1=A.length();
        int count2=B.length();
        System.out.println(count1+count2);
        int lexComparison = A.compareTo(B);
        if (lexComparison > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    
    System.out.println(Character.toUpperCase(A.charAt(0))+A.substring(1)+" "+Character.toUpperCase(B.charAt(0))+B.substring(1));
}
}



