package ses5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AgeValidator validator = new AgeValidator();
        try{
            validator.validateAge(16);
        } catch(InvalidAgeException e) {
            System.out.println("[ERROR] "+e.getMessage());
        }

        try{

            level1();

        } catch (ArithmeticException e) {
            System.out.println("This was caught in main: "+e.getMessage());
        }

        FileReader file = new FileReader(new File(".\\Session 5\\ses5\\src\\main\\java\\ses5\\test.txt")); // won't raise
        //FileReader file2 = new FileReader(new File(".\\Session 5\\ses5\\src\\main\\java\\ses5\\test2.txt")); // will raise an error but because of "throws IOException" it doesn't break the compiler

        try{
            FileReader file3 = new FileReader(new File(".\\\\Session 5\\\\ses5\\\\src\\\\main\\\\java\\\\ses5\\\\test3.txt")); // tries this
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage()); //runs this if a file not found exception is raised

        } finally {
            System.out.println("End"); // runs at the end of the try block, whether it found an exception or not
        }
        int i;
        while ((i=file.read()) != -1) {
            System.out.printf("%c",(char) i);
        }
        System.out.printf("%n");
        //System.out.println(file.read());
        file.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(".\\Session 5\\ses5\\src\\\\main\\java\\ses5\\test.txt"))) {
            String line;
            while ((line= reader.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("error: "+e.getMessage());
        }
    }
    public static void level1() {
        level2();
    }
    public static void level2() {
        level3();
    }
    public static void level3() {
        int result = 10 / 0 ; //Arithmetic error
    }
}