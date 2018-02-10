import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int testCases = Integer.parseInt(in.nextLine());
        String resultString = "";
        while(testCases>0){
            System.out.println("Enter Pattern");
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern p = Pattern.compile(pattern);
                resultString = resultString + "Valid" + "\n";
            } catch(PatternSyntaxException e) {
                resultString = resultString + "Invalid" + "\n";
            }
            testCases--;

        }
        System.out.println(resultString);
    }
}
