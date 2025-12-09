package main.java.com.examples.tourism.model;
public class UserAccount {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getName(){ return username;}
    public String getPassword(){return password;}
}
