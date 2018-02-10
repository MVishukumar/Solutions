import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Printing array");

        for(int i=0; i<n; i++) {
            System.out.print(a[i] + ", ");
        }

        int i=0, j=0, p=0, q=0, tempSum = 0, totalCount = 0;
        for(i=0; i<n; i++) {
            for(j=i; j<n; j++) {

                for(int m = i; m <= j; m++) {
                    tempSum += a[m];
                }

                if(tempSum < 0) {
                    totalCount++;
                }

            }
        }

        System.out.println("Total Number of elements having negative sum are : " + totalCount);

    }
}
