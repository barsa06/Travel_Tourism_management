package controller;
import java.util.Scanner;
import service.TravelService;


public class MenuController {
        public void start(){
            TravelService service = new TravelService();
            
        while(true){
        System.out.println("Welcome to Travel and Tourism Management System!");
        System.out.println("1. View packages");
        System.out.println("2. Book a Packages");
        System.out.println("3. View Bookings");
        System.out.println("4. Cancel Booking");
        System.out.println("5. Exit");
        System.out.println("Enter your choice:");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        
        
        
        switch (choice) {
            case 1:
                System.out.println("view packages");
                break;
            case 2:
                System.out.println("Enter the details below to book the packages.");
                input.nextLine();
                service.startBooking();
                break;
                
            case 3:
                System.out.println("view bookings");
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

