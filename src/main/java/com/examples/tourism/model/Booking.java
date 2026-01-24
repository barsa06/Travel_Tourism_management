package model;
public class Booking {
    private String customerName;
    private String contact;
    private int packageId;

    public Booking(String customerName, String contact, int packageId) {
        this.customerName = customerName;
        this.contact = contact;
        this.packageId = packageId;
    }
    public String getCustomerName() { return customerName; }
    public int getPackageId() { return packageId; }
    public String getContact() { return contact; }

}
