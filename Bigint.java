package basicprograms;
import java.util.*;
public class Bigint  {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    String a=sc.next();
        String b=sc.next();
        BigInteger a1=new BigInteger(a);
        BigInteger a2=new BigInteger(b);
          BigInteger result1=a1.add(a2);
          BigInteger result2=a1.multiply(a2);
        System.out.println(result1);
                System.out.println(result2);

            }
}



