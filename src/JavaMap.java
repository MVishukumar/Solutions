import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        System.out.println("Hi");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=in.nextInt();
        in.nextLine();

        Map<String, Integer> phonebook = new HashMap();

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter name");
            String name=in.nextLine();
            System.out.println("Enter phone number");
            int phone=in.nextInt();

            phonebook.put(name, phone);

            in.nextLine();
        }

        System.out.println(phonebook);

        System.out.println("Queries Begin...");
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(phonebook.get(s) != null) {
                System.out.println("Entry for " + s + " is present in phonebook");
                System.out.println(s + "=" + phonebook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
