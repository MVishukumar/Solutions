import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        /*System.out.println("Enter size of array");
        int n = in.nextInt();
        System.out.println("Enter size of subarray");
        int m = in.nextInt();*/

        int n=6, m=3;

        int[] myArray = new int[n];

        int[] temp = {5,3,5,2,3,2};

        System.out.println("Enter array elements");
        Set mySet = new HashSet<>();
        List myList = new ArrayList();
        for (int i = 0; i < n; i++) {
            //int num = in.nextInt();
            //myArray[i] = num;
            myArray[i] = temp[i];

        }

        System.out.println("Printing my array...");
        for(int i=0; i<n; i++) {
            System.out.print(myArray[i] + " ");
        }

        int max = 0;

        for(int i=0; i<= n-m; i++) {
            for(int j=i; j<i+m; j++) {
                System.out.println("Adding " + myArray[j] + " to hash set");
                if(!mySet.contains(myArray[j])) {
                    mySet.add(myArray[j]);
                }
            }
            System.out.println("At the end of iteration " + i + " set contains " + mySet.size() +  " elements");
            System.out.println(mySet);
            //myList.add(mySet.size());
            if(mySet.size() > max) {
                max = mySet.size();
            }
            mySet.clear();
        }

        System.out.println("Printing my list");
        System.out.println(myList);

        //Collections.sort(myList);
        System.out.println("Max element : " + max);
    }
}
