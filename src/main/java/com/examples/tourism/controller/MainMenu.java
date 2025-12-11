package controller;
import java.util.Scanner;

public class MainMenu {
        public void start(){
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
                System.out.println("View Packages");
                break;
            case 2:
                System.out.println("Book a Packages");
                break;
            case 3:
                System.out.println("View all booking");
                break;
            case 4:
                System.out.println("Cancel Booking");
                break;
            case 5:
                System.out.println("Exiting from the system");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

    }


}
