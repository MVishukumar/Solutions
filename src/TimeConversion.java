import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "12:00:00PM";
        String result = timeConversion(s);
        System.out.println(result);
    }

    static String timeConversion(String s) {
        // Complete this function
        String[] parts = s.split(":");

        int ampmIndex;
        boolean addTwelveHours = false;
        if(parts[2].indexOf("AM") == -1) {
            if(Integer.parseInt(parts[0]) != 12) {
                addTwelveHours = true;
            }
        }

        int hours;

        if(parts[2].indexOf("AM") != -1) {
            if(Integer.parseInt(parts[0]) == 12) {
                return "00" + ":" + parts[1] + ":" + parts[2].substring(0,2);
            } else {
                return parts[0] + ":" + parts[1] + ":" + parts[2].substring(0,2);
            }
        }

        if(parts[2].indexOf("PM") != -1) {
            if(Integer.parseInt(parts[0]) != 12) {
                hours = Integer.parseInt(parts[0]) + 12;
                return hours + ":" + parts[1] + ":" + parts[2].substring(0,2);
            } else {
                return parts[0] + ":" + parts[1] + ":" + parts[2].substring(0,2);
            }
        }




        /*System.out.println("AM PM INDEX = " + ampmIndex);
        String seconds = parts[2].substring(0, ampmIndex);
        System.out.println("Seconds = " + seconds);
*/
        return "";
    }
}
