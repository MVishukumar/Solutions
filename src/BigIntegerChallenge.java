import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerChallenge {
    public static void main(String[] args) {
        //System.out.println("Enter Two Numbers");
        Scanner s = new Scanner(System.in);
        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();


        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
