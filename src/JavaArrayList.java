import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of arrays");
        int n = sc.nextInt();

        ArrayList<int[]> arrayListOfArray = new ArrayList<>(n);

        int d;

        for(int i=0; i<n; i++) {
            System.out.println("Array " + i + " will have how many elements?");
            d = sc.nextInt();

            int[] tempArray = new int[d];

            for(int j=0; j<d; j++) {

                System.out.println("Enter value for array#" + i + " element#" + j);
                tempArray[j] = sc.nextInt();
            }

            arrayListOfArray.add(tempArray);

        }

        System.out.println("Printing arraylist of array");

        for(int i=0; i<arrayListOfArray.size(); i++) {
            int[] tempArray = arrayListOfArray.get(i);

            System.out.print("[");
            for(int j=0; j<tempArray.length; j++) {
                System.out.print(tempArray[j] + " ");
            }
            System.out.println("]");

        }

        int noOfQueries;
        System.out.println("How many queries do you have?");
        noOfQueries = sc.nextInt();

        for(int i=0; i<noOfQueries; i++) {
            System.out.println("Enter values of x and y");
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                int[] tempArray = arrayListOfArray.get(x-1);
                System.out.println("Element at array " + x + ", at position " + y + " is " + tempArray[y]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }


        }

    }
}
