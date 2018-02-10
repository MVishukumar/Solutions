package earth;

import java.util.Scanner;

public class MaxPower {
    public static void main(String[] args) {
        System.out.println("Hi");

        int numOfTt = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases");

        numOfTt = sc.nextInt();

        int a[];

        for(int i=0; i<numOfTt; i++) {
            System.out.println("Test case " + (i+1) + " will have how many elements?");

            int numOfElements = 0;

            numOfElements = sc.nextInt();

            if(numOfElements == 1) {

                int firstMax = sc.nextInt();
                System.out.println("Max difference = " + firstMax);
                continue;
            }

            if(numOfElements == 2) {
                int firstNum = sc.nextInt();
                int secondNum = sc.nextInt();

                if( (firstNum - secondNum) > (secondNum - firstNum) ) {
                    System.out.println("Max difference = " + (firstNum - secondNum));
                    continue;
                } else if((secondNum - firstNum) > (firstNum - secondNum) ) {
                    System.out.println("Max difference = " + (secondNum - firstNum));
                    continue;
                } else {
                    System.out.println("Max difference = " + (secondNum - firstNum));
                    continue;
                }
            }


            a = new int[numOfElements];

            System.out.println("Enter elements ");
            for(int j=0; j<numOfElements; j++) {
                a[j] = sc.nextInt();
            }

            System.out.println("All elements : " );
            for(int x: a) {
                System.out.print(x);
            }

            int max = 0;
            for(int m=0; m<numOfElements-1; m++) {
                if(a[m] - a[m+1] > max) {
                    max = a[m] - a[m+1];
                }

                if(a[m+1] - a[m] > max) {
                    max = a[m+1] - a[m];
                }
            }
            System.out.println();

            System.out.println("Max difference = " + max);
        }
    }
}
