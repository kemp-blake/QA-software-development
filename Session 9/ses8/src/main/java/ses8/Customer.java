package src.main.java.ses8;

public class Customer {
    final String name;
    final String city;
    Customer(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    
}
