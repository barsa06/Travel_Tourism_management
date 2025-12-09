package main.java.com.examples.tourism.model;
public class Booking {
    private int bookingId;
    private String customerName;
    private String contact;
    private int packageId;
    private double amountPaid;

    public Booking(int bookingId, String customerName, String contact, int packageId, double amountPaid) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.contact = contact;
        this.packageId = packageId;
        this.amountPaid = amountPaid;
    }
    public int getBookingId() { return bookingId; }
    public String getCustomerName() { return customerName; }
    public int getPackageId() { return packageId; }
    public String getContact() { return contact; }
    public double getAmountPaid() { return amountPaid; }

}
