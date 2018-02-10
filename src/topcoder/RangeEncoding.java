package topcoder;

public class RangeEncoding {
    public static void main(String[] args) {
        System.out.println("Hi");

        int[] arr = {1,6,10,20,32,49};

        int missCount = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i]-arr[i-1] != 1) {
                System.out.println("Miss count at " + arr[i]);
                missCount++;
            }
        }

        System.out.println("Total Number of misscounts : " + missCount);

    }
}
