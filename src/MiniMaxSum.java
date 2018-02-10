import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }

    static void miniMaxSum(int[] arr) {
        // Complete this function
        Arrays.sort(arr);

        long sum = 0;

        for(int i=0; i<arr.length-1; i++) {
            sum += arr[i];
        }

        System.out.println("Min sum = " + sum);
        sum = sum - arr[0];
        sum = sum + arr[arr.length-1];
        System.out.println("Max sum = " + sum);



    }
}
