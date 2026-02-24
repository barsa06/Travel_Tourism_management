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

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Booking{customerName='" + customerName + "', contact='" + contact + "', packageId=" + packageId + '}';
    }

}
