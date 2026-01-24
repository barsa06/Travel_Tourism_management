package model;
public class Package {
    private int packageId;
    private String destination;
    private int days;
    private double price;

    public Package(int packageId, String destination, int days, double price) {
        this.packageId = packageId;
        this.destination = destination;
        this.days = days;
        this.price = price;
    }
    public int getPackageId() { 
        return packageId; 
    }
    public String getDestination() { 
        return destination;
    }
    public int getDays(){
         return days;
        }
    public double getPrice() { 
        return price; 
    }
}
