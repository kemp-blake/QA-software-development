package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws Exception {
        //System.out.println(new File("Session 8\\files\\src\\main\\java\\files\\files\\reader.txt").getAbsolutePath());
        //FileReader fileReader = new FileReader("Session 8\\files\\src\\\\main\\java\\files\\files\\reader.txt");
        //BufferedReader bufferedReader = new BufferedReader(fileReader);
        //String line;
        //while ((line = bufferedReader.readLine()) != null){
        //    System.out.println(line);
        //}
//
        //bufferedReader.close();
//
        ////Path filepath = Paths.get("Session 8\\files\\src\\\\main\\java\\files\\files\\reader.txt");
        //Path filepath = Path.of("Session 8\\files\\src\\\\main\\java\\files\\files\\reader.txt");
        //Files.writeString(filepath, "test3\n123\n456\n789" );
        //String all = Files.readString(filepath, StandardCharsets.UTF_8);
        //System.out.println(all);
        

        //for (String lineread : Files.readAllLines(filepath)) {
        //    System.out.println(lineread);
        //}

        //Json
        //Person person = new Person("Blake Kemp", 23);
//
        //Gson gson = new Gson();
//
        //String json = gson.toJson(person);
//
//
        //Path filepath = Path.of("Session 8\\files\\src\\\\main\\java\\files\\files\\object.json");
//
        //Files.writeString(filepath, json );
        //String all = Files.readString(filepath, StandardCharsets.UTF_8);
        //System.out.println(all);
//
//
        //String load = Files.readString(filepath);
//
        //Person person2 = gson.fromJson(load, Person.class);
//
        //System.out.println("Name: "+person2.getName()+", Age: "+ person2.getAge());

        
        Path filepath = Path.of("Session 8\\files\\src\\\\main\\java\\files\\files\\object.json");
        Person person = new Person("Blake Kemp", 23);

        FileJsonHelper.writeJson(filepath, person);

        Person person2 = FileJsonHelper.readJson(filepath, Person.class);

        System.out.println(person2.getName()+", "+person2.getAge());








    }

}