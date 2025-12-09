package main.java.com.examples.tourism.model;
public class Package {
    private int id;
    private String destination;
    private int days;
    private double price;

    public Package(int id, String destination, int days, double price) {
        this.id = id;
        this.destination = destination;
        this.days = days;
        this.price = price;
    }
    public int getPackageId() { return id; }
    public String getDestination() { return destination; }
    public int getDays(){ return days;}
    public double getPrice() { return price; }
}
