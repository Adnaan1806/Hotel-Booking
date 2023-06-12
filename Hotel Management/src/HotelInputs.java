import java.util.Scanner;

public class HotelInputs {
    int pack = 0;
   public void Menu() {

       Scanner sc = new Scanner(System.in);

       while (pack != 1 && pack != 2 && pack != 3) {
           System.out.println("Select 1 for Day Outing \t \t Select 2 for Room Booking \t \t Select 3 to Exit");
           System.out.println("Select one From the above options to view Packages: ");
            pack = sc.nextInt();

           if (pack == 1) {
               System.out.println("Day Outing Package: ");
               System.out.println("\t\t-Welcome Drink");
               System.out.println("\t\t-Lunch(Buffet)");
               System.out.println("\t\t-Evening Tea With Cake");
               System.out.println("\t\t-Swimming Pool");
               System.out.println("\t\t-Wifi");
               System.out.println("\t\t-Day Room");
               System.out.println("Priced at 3950/- nett per person".toUpperCase());
           }
           else if (pack == 2) {
               System.out.println("Room Booking Packages: ");
               System.out.println("\t\t-Welcome Drink");
               System.out.println("\t\t-All 3 Meals(Buffet)");
               System.out.println("\t\t-Swimming Pool");
               System.out.println("\t\t-Evening Tea(Buffet)");
               System.out.println("\t\t-Wifi");
               System.out.println("\t\t-Boat Ride");
               System.out.println("\t\t-Whale Watching");
               System.out.println("'Deluxe' Priced at 16350/- nett per night and 'Superior Deluxe' Priced at 24550/- nett per night".toUpperCase());
           }
           else if (pack == 3) {
               System.exit(0);
           }
           else {
               System.out.println("INVALID OPTION!!, Please Choose A Valid Option");
           }
       }
   }
}
