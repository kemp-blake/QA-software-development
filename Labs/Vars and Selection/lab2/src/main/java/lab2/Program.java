package lab2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int inputMark;
        do {
            System.out.println("Input a mark between 1 and 100.");
            inputMark = Integer.parseInt(scanner.nextLine().trim());

        } while (inputMark>100 || inputMark<1);
        if (inputMark < 50 ) {
            System.out.println("This mark is a fail.");
        } else if (inputMark <= 60 ) {
            System.out.println("This mark is a pass.");
        } else if (inputMark <= 70 ) {
            System.out.println("This mark is a merit.");
        } else {
            System.out.println("This mark is a distinction.");
        }
        scanner.close();

    }
}