import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        Arrays.sort(ar);

        for(int a: ar) {
            System.out.print(a + " ");
        }
        System.out.println();

        int maxNumber = ar[ar.length-1];

        int firstOccurence = 0;

        for(int i=0; i<n; i++) {
            if(ar[i] == maxNumber) {
                firstOccurence = i;
                break;
            }
        }




        System.out.println("Max element = " + maxNumber + " first occurence = " + firstOccurence);

        return ar.length - firstOccurence;
    }
}
