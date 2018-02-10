import java.util.Calendar;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();



        cal.set(2018, 0, 27, 0, 0);

        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                System.out.println("SUNDAY"); break;
            case 2:
                System.out.println("MONDAY"); break;
            case 3:
                System.out.println("TUESDAY"); break;
            case 4:
                System.out.println("WEDNESDAY"); break;
            case 5:
                System.out.println("THURSDAY"); break;
            case 6:
                System.out.println("FRIDAY"); break;
            case 7:
                System.out.println("SATURDAY"); break;
        }
    }
}
