package ses2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
//
//
//
        //// This won't give a gamer tag
        //System.out.println("Enter your name: ");
        //String name = scanner.nextLine();
        //System.out.println("Enter your age: ");
        //int age = scanner.nextInt();
        //System.out.println("Enter your score: ");
        //double score = scanner.nextDouble();
        //System.out.println("Enter your Game Tag: ");
        //String gamertag = scanner.nextLine();
        //System.out.println("Hello "+ name +"! Your age is "+ age +" and your score is "+score+". Your Game Tag is: "+ gamertag);
//
        ////This is with parsing the next lines which should work.
        //
        //System.out.println("Enter your name: ");
        //String name2 = scanner.nextLine();
        //System.out.println("Enter your age: ");
        //int age2 = Integer.parseInt(scanner.nextLine().trim());
        //System.out.println("Enter your score: ");
        //double score2 = Double.parseDouble(scanner.nextLine().trim());
        //System.out.println("Enter your Game Tag: ");
        //String gamertag2 = scanner.nextLine();
        //System.out.println("Hello "+ name2 +"! Your age is "+ age2 +" and your score is "+score2+". Your Game Tag is: "+ gamertag2);
//
        //scanner.close();

        //printf and .format
        //System.out.printf("Integer: %d%nString: %s", 10, "test");
//
        //String name = "Blake";
        //int age = 23;
        //Double score = 2.3;
        //String l = String.format("Name: %s%nAge: %d%nScore: %f", name, age, score);
//
        //System.out.println(l);

        //conditional

        //higher or lower game

        int lives = 3; //user lives

        int computerGuess = (int) (Math.random()*11); //random number between 1 and 10
        Scanner scanner = new Scanner(System.in); //initiate scanner

        while (lives > 0) { // while user has lives
            System.out.println(lives+" lives left.");
            int userGuess = -1; // Set userguess outside of do scope

            do { // do validation
                System.out.println("Enter a number between 1 and 10.");
                userGuess = Integer.parseInt(scanner.nextLine().trim()); //set userGuess to user's guess and convert to int
            } while (userGuess < 1 || userGuess > 10); // while userguess is less than 1 or more than 10

            if (userGuess > computerGuess) { // if user guess is greater than computer guess:
                System.out.println("The computer's guess was lower.");
                --lives; // remove 1 life
            } else if (userGuess < computerGuess) { // if user guess is lower than computer guess:
                System.out.println("The computer's guess was higher.");
                --lives; // remove 1 life
            } else { // else (if user guess is the same as computer guess)
                System.out.println("Correct!");
                break; // end loop
            }

        }
        

        //ternary operator

        boolean win_condition = (lives == 0) ? false : true; //this is kind of a stupid one, I could just do !(lives ==0) or flip the if statement
        if (win_condition) { // if lives = 0:
            System.out.println("You won!");
        } else { // else (if lives != 0):
            System.out.println("0 lives left.");
            System.out.println("You lost!");
        }


        scanner.close(); // close scanner


        
    }
}