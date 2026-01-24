package service;

import java.util.ArrayList;
import model.Package;
import model.Booking;

public class TravelService{
    private ArrayList<Package> packages = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();

    public TravelService() {
    packages.add(new Package(1, "Pokhara", 5, 15000));
    packages.add(new Package(2, "Kathmandu", 3, 10000));
    packages.add(new Package(3, "Chitwan", 4, 12000));
}
public void showPackages() {
    for (int i = 0; i < packages.size(); i++) {
        Package p = packages.get(i);
        System.out.println(
            p.getPackageId() + ". " +
            p.getDestination() + " | " +
            p.getDays() + " days | Rs. " +
            p.getPrice()
        );
    }
}
public void bookPackage(String customerName, String contact, int packageId ){
    for (int i = 0; i < packages.size(); i++) {
        Package p = packages.get(i);
        if(p.getPackageId()== packageId){
            System.out.println("Booking successful!");
            return;
        }
}
System.out.println("Invalid choice.");
System.out.println("The package id doesn't match.");
}

}