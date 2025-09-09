package lab9abstract;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Duck("Josh"));
        animals.add(new Penguin("Sabrina"));
        animals.add(new Fish("Ryan"));
        animals.add(new Duck("Penny"));
        animals.add(new Penguin("David"));
        animals.add(new Fish("Bubbles"));
        animals.add(new Lizard("Barbara"));
        animals.add(new Lizard("Elizabeth"));

        for (Animal animal : animals) {
            System.out.println(animal.getName());
            if (animal instanceof Bird){
                Bird bird = (Bird) animal;
                bird.makeNest();
            }
            if (animal instanceof Lizard){
                Lizard lizard = (Lizard) animal;
                lizard.makeNest();
            }


            if (animal instanceof Flyable){
                Flyable bird = (Flyable) animal;
                bird.fly();
            }
            if (animal instanceof Swimmable){
                Swimmable bird = (Swimmable) animal;
                bird.swim();
            }
            if (animal instanceof Movable){
                Movable bird = (Movable) animal;
                bird.move();
            }

            System.out.println("");
        }
    }
}