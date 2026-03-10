package controller;
import java.util.Scanner;
import service.TravelService;


public class MenuController {
        public void start(){
            TravelService service = new TravelService();
            
        while(true){
        System.out.println("==============================================");
        System.out.println("      Travel and Tourism Management System    ");
        System.out.println("==============================================");
        System.out.println("1. View available Packages");
        System.out.println("2. Book a Package");
        System.out.println("3. View Bookings");
        System.out.println("4. Cancel a Booking");
        System.out.println("5. Exit");
        System.out.println("----------------------------------------------");
        System.out.println("\nPlease select an option by entering the corresponding number.");
        System.out.print("Choice: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        input.nextLine(); 

        switch (choice) {
            case 1:
                service.viewPackages();
                break;
            case 2:
                System.out.println("Enter the details below to book the packages.");
                service.startBooking();
                break;
            case 3:
                service.viewBookings();
                break;
            case 4:
                System.out.println("Cancel Booking");
                break;
            case 5:
                System.out.println("Exiting from the system");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

    }
  }
        
}

