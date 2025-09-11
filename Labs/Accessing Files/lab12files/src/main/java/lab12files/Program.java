package lab12files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Program {
    public static void main(String[] args) throws IOException{
        String[] courses = readCSV("Labs\\Accessing Files\\lab12files\\src\\main\\resources\\course.txt");
        String[] trainers = readCSV("Labs\\Accessing Files\\lab12files\\src\\main\\resources\\trainer.txt");


        Path writepath = Path.of("Labs\\Accessing Files\\lab12files\\src\\main\\resources\\TrainersAndCourses.txt");
        Files.writeString(writepath, String.join(",", courses)+"\n"+String.join(",", trainers));
        
    }
    private static String[] readCSV(String inFile) throws IOException {
        Path filepath = Path.of(inFile);
        String contents = Files.readString(filepath);
        return contents.split(",");
    }
}