import java.util.Scanner;

public class Main{

public static void main(String[] args) {
    System.out.println("Welcome TO Movie World \n");
    movie m=new movie();
    int choice;
    int q=1;
    Scanner sc=new Scanner(System.in);
    while(q!=0)
    {
        System.out.println("Enter 1.To book in counter1: 2.To book in counter2: 3. TO refill Tickets \n");
        System.out.println("Enter your choice: \n");
        choice= sc.nextInt();
        

        switch(choice)
        {
            case 1: if(choice==1){
                m.bookTicket();
                    break;
            }
            case 2: if(choice==2){
                m.bookTicket();
                    break;
            }
            case 3: if(choice==3){
                m.RefillTicket();
                    break;
            } 
            case 4: q=0;
        }   
    }
    
}

}