package labs14stla;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerFilter   {
   public static List<Customer> filterByCity(List<Customer> customers, String city)
   {
    return customers.stream() // starts a stream on the given list of customers
            .filter(customer->customer.getCity().equalsIgnoreCase(city)) // gets city of each customer and compares to given city (ignores case)
            .collect(Collectors.toList()); // returns list of the custoemrs that return true to the above
    }
}

