import java.util.Scanner;

public class movie {
    int total_tickets=100;
    int total_shows;
    int n;
    public int bookTicket()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of tickets to be booked");
        n=input.nextInt();
        try{
            if(total_tickets>0)
            {
                total_tickets=total_tickets-n;
                System.out.println("Total Tickets Booked"+n);
                System.out.println("Remaining tickets:"+total_tickets);
                return 0;
            }
            else{
                System.out.println("No tickets available");
            }
            
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        return 0;
        
    }

    public void RefillTicket()
    {
        total_tickets=100;
        System.out.println("Ticket is refilled successfully ");
        System.out.println("Ticket count is:"+total_tickets);

    }
}
