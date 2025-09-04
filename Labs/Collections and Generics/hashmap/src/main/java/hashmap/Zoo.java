package hashmap;

import java.util.HashMap;

public class Zoo {
    static HashMap<String, Integer> animalMap = null;
    String[] originalAnimals = { "Zebra", "Lion", "Buffalo"};
    String[] newAnimals = {"Zebra", "Gazelle", "Buffalo", "Zebra"};


    Zoo(){ //constructor
        animalMap = new HashMap<>();

        addAnimals(originalAnimals);
        addAnimals(newAnimals);

        displayAnimalData();

    }

    private static void addAnimals(String[] animals){
        for(String animal : animals) {
            animalMap.put(animal, animalMap.getOrDefault(animal, 0)+1);
        }
    }

    private static void displayAnimalData() {
        for(String animal : animalMap.keySet()){
            System.out.printf("%s: %d%n", animal, animalMap.get(animal));
        }
    }
}
