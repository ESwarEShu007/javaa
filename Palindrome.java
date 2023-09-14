package basicprograms;
import java.util.*;
public class Palindrome  {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String result=A;
        String reversed="";
        for(int i=A.length()-1;i>=0;i--){
            reversed+=A.charAt(i);
        }
        
        if(reversed.equals(result)){
        System.out.println("Yes");
        
        }else 
                System.out.println("No");

    }
}






