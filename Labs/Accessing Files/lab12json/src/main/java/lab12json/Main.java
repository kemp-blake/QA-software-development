package lab12json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws IOException{

        Gson gson = new Gson();

        String fileName = "Labs\\Accessing Files\\lab12json\\src\\main\\resources\\customers.json";

        String content = new String(Files.readAllBytes(Paths.get(fileName)));

        Customer[] customers = gson.fromJson(content, Customer[].class);

        System.out.println(customers[0].CustomerID);

        ArrayList<Customer> customersToWrite = new ArrayList<>();

        Customer customer1 = new Customer();
        customer1.ContactName = "Blake Kemp";
        customer1.CustomerID = "test4";

        customersToWrite.add(customer1);

        for (Customer customer : customers){
            customersToWrite.add(customer);
        }

        Files.writeString(Paths.get(fileName), gson.toJson(customersToWrite));

    }
}