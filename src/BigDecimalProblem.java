import java.math.BigDecimal;
import java.util.*;

public class BigDecimalProblem {
    public static void main(String[] args) {
        System.out.println("Hi");
        //Scanner sc= new Scanner(System.in);
        //System.out.println("Enter total numbers");
        //int n=sc.nextInt();
        //String []s=new String[n+2];

        int n=9;
        String []s= {
                "-100","50","0","56.6","90","0.12",".12","02.34","000.000"
        };

        //BigDecimal[] decimalArray = new BigDecimal[n];

        ArrayList<BigDecimal> decimalArray = new ArrayList<>();

        for(int i=0;i<n;i++){
            //s[i]=sc.next();
            decimalArray.add(new BigDecimal(s[i]));
        }
        //sc.close();


        System.out.println("Printing numbers");
        for(String a : s ) {
            System.out.print(a + ", ");
        }

        System.out.println("\nPrinting BigDecimal Array");
        System.out.println(decimalArray);

        Collections.sort(decimalArray, Collections.reverseOrder());


        System.out.println("\nPrinting Sorted BigDecimal Array");
        System.out.println(decimalArray);

        System.out.println("FINAL SORTED ARRAY");

        String[] finalArray = new String[n+2];
        int finalArrayIndex = 0;

        Iterator it = decimalArray.iterator();
        while(it.hasNext()) {
            BigDecimal element = (BigDecimal) it.next();
            //System.out.println("Element under match : " + element);
            BigDecimal temp;
            for(int i=0; i<n; i++) {
                temp = new BigDecimal(s[i]);
                //System.out.println("Temp : " + temp);
                if(element.compareTo(temp) == 0) {
                    //System.out.println(element + " and " + temp + " are match ");
                    System.out.println(s[i]);
                    finalArray[finalArrayIndex++] = s[i];
                    s[i] = "-00000000000000.12";

                    break;
                }
            }
        }

        for(int i=0; i<n; i++) {
            s[i] = finalArray[i];
        }

        System.out.println();
    }
}
