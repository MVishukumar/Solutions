import java.util.Scanner;

public class Java1DArrayPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of queries");
        int q = scan.nextInt();
        while (q-- > 0) {
            System.out.println("Enter size of array");
            int n = scan.nextInt();
            System.out.println("Enter leap");
            int leap = scan.nextInt();

            int[] game = new int[n];
            System.out.println("Enter Array Elements");
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println("Array Elements...");
            for (int i = 0; i < n; i++) {
                System.out.print(game[i] + " ");
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

    public static boolean canWin(int leap, int[] game) {

        int oneIndex = 0;
        int start = 0;
        int endIndex = 0;
        int newOneIndex = 0;
        for(int i=1; i<game.length; i++) {
            if(game[i] == 1) {
                oneIndex = i;
                break;
            }
        }



        if(oneIndex == 0) {
            //System.out.println("No 1s found... returning true");
            return true;
        }

        start = oneIndex-1;
        if(start + leap >=  game.length ) {
            return true;
        } else {
            if(game[start+leap] == 0) {
                //From here if all other elements are 0 then win, else lose
                start = (start+leap);
                for(int i=start+1; i<game.length; i++) {
                    if(game[i] == 1) {
                        return false;
                    }
                }
                return true;

            } else {
                return false;
            }
        }


    }
}
