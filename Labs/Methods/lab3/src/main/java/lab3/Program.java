package lab3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //String readString = getString("Input a string: ");
        //int readInteger = getInt("Input an integer: ");
        //System.out.printf("String: %s%nInteger: %d%n", readString, readInteger);
        //theLunchQueue();
        convertKgsToStone(50);
        convertPoundsToStone(39);

    }
    public static int getInt(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in); 
        return scanner.nextInt();

    }
    public static String getString(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in); 
        return scanner.nextLine();

    }

    public static void theLunchQueue() {
        String mainChoice;
        do{
            mainChoice = getString("What main dish would you like (chicken, fish or vegetarian?)");
            switch (mainChoice) {
                case "chicken", "fish", "vegetarian": 
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (!mainChoice.equals("chicken")&&!mainChoice.equals("fish")&&!mainChoice.equals("vegetarian"));
        int potatoesChoice;
        do{
            potatoesChoice = getInt("How many roast potatoes would you like?");
        } while (potatoesChoice < 0);
        int brusselChoice;
        do{
            brusselChoice = getInt("How many brussel sprouts would you like?");
        } while (brusselChoice < 0);

        System.out.printf("Hello, your lunch is %s with %d roast potatoes and %d brussel sprouts.", mainChoice, potatoesChoice, brusselChoice);
    }

    public static void convertPoundsToStone(int pounds) {
        double floatStone = pounds / 14;
        int stone = (int) floatStone;
        System.out.printf("%d stone and %d pounds%n", stone, pounds % 14);
    }
    public static void convertKgsToStone(int kgs) {
        double doubpounds = kgs * 2.20462;
        int pounds = (int) doubpounds;
        convertPoundsToStone(pounds);
    }

}