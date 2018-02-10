package earth;

import java.util.Scanner;

public class MonkVisitCoderland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases");
        int numOfTc = sc.nextInt();

        int[] ratePerLiter;
        int[] requiredAmountOfPetrol;
        int sum = 0;

        for(int i=0; i<numOfTc; i++) {
            System.out.println(i + " will have how many elements?");

            int numOfCheckPoints = sc.nextInt();

            ratePerLiter = new int[numOfCheckPoints];
            requiredAmountOfPetrol = new int[numOfCheckPoints];

            System.out.println("Enter nodes");
            for(int j=0; j<numOfCheckPoints; j++) {
                ratePerLiter[j] = sc.nextInt();
            }

            System.out.println("Enter required petrol");
            for(int j=0; j<numOfCheckPoints; j++) {
                requiredAmountOfPetrol[j] = sc.nextInt();
            }

            for(int k=0; k<numOfCheckPoints; k++) {
                sum = sum + (ratePerLiter[k] * requiredAmountOfPetrol[k]);
            }

        }

        System.out.println(sum);
    }
}
