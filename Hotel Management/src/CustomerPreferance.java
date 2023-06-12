import java.util.Scanner;

public class CustomerPreferance extends HotelInputs{

    public void payments(){
        Scanner s = new Scanner(System.in);
        double total = 0;
        double tax;
        Menu();
        if (pack == 1){
            System.out.print("Enter No Of People: ");
            int noOFPeople = s.nextInt();

            total = noOFPeople * 3950;
            System.out.println("Total Amount To Be Paid: "+ total);

        }
        else if (pack == 2) {
            int packType = 0;
            while (packType !=1 && packType != 2) {
                System.out.println("Select Package Type: ");
                System.out.println("1 for 'Deluxe' \t or\t 2 for 'Superior Deluxe'");
                System.out.println("Choose 1 from above options: ");
                packType = s.nextInt();
            }
            if (packType == 1){
                System.out.println("Selected Room Package: "+packType);
                System.out.println("How Many Nights To Be Booked: ");
                int nights = s.nextInt();

                total = nights * 16350;
                tax = total * 1.5/100;
                total = total + tax;
                System.out.println("Total Bill Inclusive Of Tax: "+total);
                System.out.println("Thank you for Visiting Us, Enjoy!".toUpperCase());
            }
            else if (packType == 2) {
                System.out.println("Selected Room Package: "+packType);
                System.out.println("How Many Nights To Be Booked: ");
                int nights = s.nextInt();

                total = nights * 24550;
                tax = total * 2.5/100;
                total = total + tax;
                System.out.println("Total Bill Inclusive Of Tax: "+total);
                System.out.println("Thank you for Visiting Us, Enjoy!".toUpperCase());
            }
        }

    }
}
