package ses7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        //Parrot polly = new Parrot();
//
        //polly.speak();
        //polly.sleep();
        //polly.fly();
        //polly.eat();

        //Logger logger = new ConsoleLogger();
        //App app = new App(logger);
        //app.run();

        //ShoppingCart cart = new ShoppingCart(new CreditCardPayment());
        //cart.checkout(230);

        //Operation add = (a, b) -> a + b; // lambda (a,b) -> a + b
        //Operation multiply = (a, b) -> a * b;
//
        //System.out.println(add.apply(2,3)); // functional interface
        //System.out.println(multiply.apply(2,3));

        //IntegerContainer ic = new IntegerContainer();
        ////ic.add("test");// wont work because not integer
        //ic.add(32);
        //System.out.println(ic.get());
//
        //GenericContainer<String> gc = new GenericContainer<>();
//
        //gc.add("yes");
        //System.out.println(gc.get());

        List<Person> people = new ArrayList<>();
        people.add(new Person("James Smith", 10));
        people.add(new Person("John Brooke",40));
        people.add(new Person("Danielle Frost",50));
        people.add(new Person("Sarah Down",20));
        people.add(new Person("Ryan Ness",60));
        people.add(new Person("Tina Burton",30));

        Collections.sort(people);
        
        PersonIterator iter = new PersonIterator(people);

        while(iter.hasNext()){
            //System.out.println(iter.hasNext());
            System.out.println(iter.next().getDetails());
        }




    }
}