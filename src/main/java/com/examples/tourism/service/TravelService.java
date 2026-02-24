package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Booking;

public class TravelService {
    private List<Booking> bookings = new ArrayList<>();
    
    public void startBooking() {

        Scanner input = new Scanner(System.in);
        boolean choice = true;

        while (choice) {

            System.out.println("Enter the customer name:");
            String customerName = input.nextLine();

            System.out.println("Enter the contact:");
            String contact = input.nextLine();

            System.out.println("Enter the package ID:");
            int packageId = input.nextInt();
            input.nextLine();

            bookings.add(new Booking(customerName, contact, packageId));

            System.out.println("Do you want to continue adding? (y/n)");
            char c = input.next().charAt(0);
            input.nextLine();

            if (c == 'n' || c == 'N') {
                choice = false;
            }
        }

        System.out.println("Bookings List::");

        for (Booking booking : bookings) {
            System.out.println(booking);
        }

        if (!bookings.isEmpty()) {
            Booking firstBooking = bookings.get(0);
            System.out.println("\nFirst booking's customer name: "
                    + firstBooking.getCustomerName());
        }

        input.close();
    }
}