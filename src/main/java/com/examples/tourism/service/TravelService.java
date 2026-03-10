package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Booking;
import model.Package;

public class TravelService {

    private List<Booking> bookings = new ArrayList<>();
    private List<Package> packages = new ArrayList<>();

    // Constructor to add sample packages
    public TravelService() {
        packages.add(new Package(1, "Pokhara Adventure", 5, 15000));
        packages.add(new Package(2, "Kathmandu Cultural", 3, 10000));
        packages.add(new Package(3, "Chitwan Safari", 4, 12000));
    }

    // Method to view all packages (simple)
    public void viewPackages() {
        System.out.println("\nAvailable Travel Packages:");
        for (Package p : packages) {
            System.out.println(
                p.getPackageId() + ". " +
                p.getDestination() + " | " +
                p.getDays() + " days | Rs. " +
                p.getPrice()
            );
        }
        System.out.println();
    }

    // Method to handle booking a package
    public void startBooking() {
        Scanner input = new Scanner(System.in);
        boolean choice = true;

        while (choice) {
            System.out.print("Enter the customer id:");
            int customerId = input.nextInt();
            input.nextLine();

            System.out.print("Enter the customer name:");
            String customerName = input.nextLine();

            System.out.print("Enter the contact:");
            String contact = input.nextLine();

            viewPackages();

            int packageId;
            boolean validPackage;
            do{
            System.out.println("Enter the package ID:");
            packageId = input.nextInt();
            input.nextLine();

            validPackage=false;
            for(Package p :packages){
                if(p.getPackageId()==packageId){
                    validPackage=true;
                    break;
                }
            }
            if(!validPackage){
                System.out.println("Invalid package ID. Please try again.");

            }
            }while(!validPackage);

            bookings.add(new Booking(customerId, customerName, contact, packageId));
            System.out.println("Do you want to continue adding? (y/n)");
            char c = input.next().charAt(0);
            input.nextLine();

            if (c == 'n' || c == 'N') {
                choice = false;
            }
        }

        System.out.println("Booking completed. Returning to main menu...");
    }

    // Method to view all bookings
    public void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            System.out.println("Bookings List:");
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }
 }
