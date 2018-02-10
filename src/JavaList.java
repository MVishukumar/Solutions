import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        System.out.println("Hi");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of ArrayList");
        int n = sc.nextInt();

        ArrayList<Integer> intArray = new ArrayList<>(n);

        System.out.println("Enter array list elements");
        for(int i=0; i<n; i++) {
            intArray.add(sc.nextInt());
        }

        System.out.println("Printing array list elements");
        System.out.println(intArray);

        System.out.println("Enter number of queries");
        int q = sc.nextInt();

        String operation = "";
        int index, element;
        for(int i=0; i<q; i++) {
            System.out.println("Enter operation");
            operation = sc.next();
            if(operation.equalsIgnoreCase("insert")) {
                System.out.println("Enter index and element");
                index = sc.nextInt();
                element = sc.nextInt();
                intArray.add(index, element);
                System.out.println("After inserting");
                System.out.println(intArray);
            } else if(operation.equalsIgnoreCase("delete")) {
                System.out.println("Enter index");
                index = sc.nextInt();
                intArray.remove(index);
                System.out.println("After deleting");
                System.out.println(intArray);
            }
        }

        Iterator it = intArray.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
