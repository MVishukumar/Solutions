public class JavaLoops2 {
    public static void main(String[] args) {
        int a,b,n;

        a=0;
        b=2;
        n=10;

        int first = (a + 1 * b);
        System.out.print(first + " ");
        for(int m=0; m<n; m++) {
            //System.out.print(first + " ");
            int sum = 0;
            for(int j=1; j<=m; j++) {
                sum += Math.pow(2,j) * b;
            }
            if( m != 0) {
                System.out.print(first + sum + " ");
            }

        }


    }
}
