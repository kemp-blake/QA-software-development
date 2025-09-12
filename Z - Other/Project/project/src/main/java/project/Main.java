/*
 * HEADER
 * = Changed the for loop to call new methods for each animal instead of printlns
 *      = cat.ignore() -> prints name + " ignores you.": So that changing the behaviour on Cat only requires you to change the class
 *      = dog.chasesTail() -> prints name + " chases tail.": So that changing the behaviour on Dog only requires you to change the class
 *      = rabbit.nibbles() -> prints name + " nibbles something?": So that changing the behaviour on Rabbit only requires you to change the class
 * = changed animalz to animals, a to animal.
 * = moved SPECIES enum outside of main
 * = declare Animal variables as private
 * = modified printReport() to returnReport() to instead return a string, this way when it is put in a thread you can print it all at once and not risk other prints splitting up the info due to the threading
 * = changed thread to run the returnReport() function and print the report: on a program this simple threading is unnecessary however if I was to add threading it would be to the report so that the arraylist can build and run through while the report is generating, this would especially be helpful if the Arraylist had 1000s of entries.
 * 
 * 
 * - removed if false as never runs: removed helper class that is never called
 * - removed cache hashmap that is never used
 * - removed random number that is never used
 * - removed kennel which is never used
 * - removed else statement in for animal in animals as it is not used and no animal can be made without a type.
 * - removed UNKNOWN species as not a valid class option
 * - removed saveAnimalsToFile as the method only printed
 * 
 * + added enum for countries so that the countries it can take ar emore obvious
 * + create AnimalFactory simple factory and made animals using it
 * + created setters for legs, getters for name to improve encapsulation
 * + added speaks interface as not all animals speak
 * 
 */


package project;

import java.util.*;

import java.security.InvalidParameterException;
import java.time.*;

public class Main {
    public static List<Animal> animals = new ArrayList<>(); 

    public static void main(String[] args) {
        animals.add(AnimalFactory.createAnimal(SPECIES.DOG, "Rex"));
        animals.add(AnimalFactory.createAnimal(SPECIES.CAT, "Mittens"));
        animals.add(AnimalFactory.createAnimal(SPECIES.RABBIT, "Flopsy"));

        System.out.println("=== Starter App ===");

        Thread reportThread =new Thread(() -> {
            try {
                Thread.sleep(333);
                System.out.println("[Thread]\nReport:\n"+returnReport(Arrays.asList("OK", "WARN", "TODO")));
            } catch (InterruptedException ignored) {}
        });

        reportThread.start();

        for (Animal animal : animals) {
            if (animal instanceof Dog) { 
                Dog dog = (Dog) animal; 
                dog.speak();
                dog.chaseTail(); 
            } else if (animal instanceof Cat) { 
                Cat cat = (Cat) animal; 
                cat.speak();
                cat.ignore(); 
            } else if (animal instanceof Rabbit) {
                Rabbit rabbit = (Rabbit) animal; 
                rabbit.speak();
                rabbit.nibble(); 
            }
            animal.move(); 
            animal.eat("food"); 
            System.out.println(); 
        }

        double bill = calculateTax(123.45, COUNTRIES.UK);
        System.out.println("Tax rough calc: " + bill);

        System.out.println("Saving to animals.json ...");
    }

    
    public static double calculateTax(double gross, COUNTRIES country) {
        if (COUNTRIES.UK == country) return gross * 0.2;
        if (COUNTRIES.FR == country) return gross * 0.19 + 3;
        return gross * 0.15;
    }

   
    public static String returnReport(List<String> lines) {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("---- REPORT ----\n");
        for (int i = 0; i < lines.size(); i = i + 1) {
            reportBuilder.append((i+1) + ") " + lines.get(i)+"\n");
            //System.out.println((i+1) + ") " + lines.get(i));
        }
        reportBuilder.append("Generated at: " + LocalDateTime.now());
        return reportBuilder.toString();
    }


    
}


// ---- Interfaces ----
interface speaks{
    public abstract void speak();
}

// ---- Abstract Classes ----
abstract class Animal {
    private String name;
    private int legs;

    public Animal(String name) {
        this.name = name;
        this.legs = -1;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void move() {
        System.out.println(name + " moves somehow on " + legs + " legs.");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food + ".");
    }
}

// --- Classes ----
class Dog extends Animal implements speaks {
    public Dog(String name) {
        super(name);
        this.setLegs(4);
    }
    @Override public void speak() {
        System.out.println(this.getName() + " says: woof");
    }
    public void chaseTail() {
        System.out.println(this.getName()+ " chases tail.");
    }
}


class Cat extends Animal implements speaks {
    public Cat(String name) {
        super(name);
        this.setLegs(4);
    }
    @Override public void speak() { System.out.println(this.getName() + " says: meow"); }
    public void ignore() {
        System.out.println(this.getName() + " ignores you.");
    }
}


class Rabbit extends Animal implements speaks {
    public Rabbit(String name) {
        super(name);
        this.setLegs(4);
    }
    @Override public void speak() { System.out.println(this.getName() + " says: squeak"); }
    public void nibble() {
        System.out.println(this.getName() + " nibbles something?");
    }
}

// ---- Classes: Factories ----
class AnimalFactory{
    static Animal createAnimal(SPECIES animalType, String name){
        switch (animalType) {
            case DOG:
                return new Dog(name);
            case CAT:
                return new Cat(name);
            case RABBIT:
                return new Rabbit(name);
            default:
               throw new InvalidParameterException("Invalid parameter for type Animal."); // if you pass an Animal type that's different from above, throw an error.
        }
    }
}


// ---- ENUMS ----
enum COUNTRIES{
    UK,
    FR
}
enum SPECIES {
    DOG, CAT, RABBIT
}



