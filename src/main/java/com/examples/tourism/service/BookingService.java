package service;

import model.Booking;

public class BookingService{
    public void bookPackage(){
    for (int i = 0; i < bookings.size(); i++) {
        Booking b = bookings.get(i);
        if(p.getPackageId()==packageId){
            bookings.add(new Booking(bookingId, customerName, contact, packageId, amountPaid));
            System.out.println("booking successful");
        }
        else{
            System.out.println("invalid choice");
        }
}
}
}