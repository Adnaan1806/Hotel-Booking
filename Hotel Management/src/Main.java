import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      CustomerPreferance c = new CustomerPreferance();
      System.out.println("------------------------- JETWING SEA HOTEL -------------------------");

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        int id = s.nextInt();
        s.nextLine();
        System.out.println("Enter your Name: ");
        String name = s.nextLine();
        System.out.println("-------------------");
        System.out.println("Welcome "+name+"!");


        c.payments();
    }
}