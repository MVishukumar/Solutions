import java.util.*;

public class WinningLotteryTicket {
    public static void main(String[] args) {
        int numberOfTickets;

        numberOfTickets = 6;

        String[] tickets = {
                "1234567890",
                "129300455",
                "5559948277",
                "012334556",
                "56789",
                "123456879"
        };

        System.out.println("Printing tickets");
        for (int i=0; i<numberOfTickets; i++) {
            System.out.println(tickets[i]);
        }


        TreeSet<Character> mySet = new TreeSet<>();
        int i, j;
        String ticket1, ticket2 = null;
        int totalWinningTickets = 0;
        for(i=0; i<numberOfTickets-1; i++) {
            ticket1 = tickets[i];

            if(     (ticket1.indexOf("0") >= 0) &&
                    (ticket1.indexOf("1") >= 0) &&
                    (ticket1.indexOf("2") >= 0) &&
                    (ticket1.indexOf("3") >= 0) &&
                    (ticket1.indexOf("4") >= 0) &&
                    (ticket1.indexOf("5") >= 0) &&
                    (ticket1.indexOf("6") >= 0) &&
                    (ticket1.indexOf("7") >= 0) &&
                    (ticket1.indexOf("8") >= 0) &&
                    (ticket1.indexOf("9") >= 0) ) {
                totalWinningTickets = totalWinningTickets + (numberOfTickets - (i+1));
                continue;
            }

            for(j=i+1; j<numberOfTickets; j++) {
                ticket2 = tickets[j];
                System.out.println("Comparing " + ticket1 + " with " + ticket2);
                String combinedTicket = ticket1 + ticket2;
                System.out.println("Combined ticket : " + combinedTicket);


                if(combinedTicket.length() < 9) {
                    continue;
                }

                if(     (combinedTicket.indexOf("0") >= 0) &&
                        (combinedTicket.indexOf("1") >= 0) &&
                        (combinedTicket.indexOf("2") >= 0) &&
                        (combinedTicket.indexOf("3") >= 0) &&
                        (combinedTicket.indexOf("4") >= 0) &&
                        (combinedTicket.indexOf("5") >= 0) &&
                        (combinedTicket.indexOf("6") >= 0) &&
                        (combinedTicket.indexOf("7") >= 0) &&
                        (combinedTicket.indexOf("8") >= 0) &&
                        (combinedTicket.indexOf("9") >= 0) ) {
                    System.out.println("WINNING TICKET: " + combinedTicket);
                    totalWinningTickets++;
                } else {
                    continue;
                }

            }




        }
        System.out.println("Total winning tickets : " + totalWinningTickets);
    }
}
