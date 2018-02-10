import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        //System.out.println("Hi");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        long[] numbers = new long[n];

        for(int i=0; i<numbers.length; i++) {
            numbers[i] = 0;
        }


        for(int a0 = 0; a0 < m; a0++){
            //System.out.println("Enter values for a,b,k");
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();


            for(int i=a-1; i<b; i++) {
                numbers[i] = numbers[i] + k;
            }

            //System.out.println("Printing array contents after addition");
            for(int i=0; i<numbers.length; i++) {
                //System.out.print(numbers[i] + " ");
            }

        }

        //System.out.println("Printing final array contents");
        for(int i=0; i<numbers.length; i++) {
            //System.out.print(numbers[i] + " ");
        }

        /*long max = numbers[0];

        for(int i=1; i<numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }*/
        Arrays.sort(numbers);

        System.out.println("End, max element is : " + numbers[numbers.length-1]);

        in.close();


    }

}
