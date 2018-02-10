package earth;

import java.util.Collection;
import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        int numberOfTestCases = 0;

        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter number of test cases");

        numberOfTestCases = sc.nextInt();


        //System.out.println("Number of test cases : " + numberOfTestCases);

        //System.out.println("Now enter strings");
        String inputString = "";
        boolean p1playing = true;
        boolean p2playing = false;
        String c = "";
        int count = 0;

        StringBuilder s = new StringBuilder();


        for(int i=0; i<numberOfTestCases; i++) {

            inputString = sc.next();


            //System.out.println(i + " : Input read : " + inputString);

            while (inputString.length() != 0) {
                count++;
                if(sc.hasNext()) {
                    c = sc.next();
                }



                System.out.print("After replacing " + c + " from " + inputString);
                System.out.println();

                String m = inputString.replaceAll(c, "");
                //inputString = inputString.replaceAll(c, "");
                inputString = m;
                System.out.println(" : " + inputString);
            }

            if(count % 2 == 0) {
                System.out.println("Player2");
            } else {
                System.out.println("Player1");
            }


        }
    }
}
