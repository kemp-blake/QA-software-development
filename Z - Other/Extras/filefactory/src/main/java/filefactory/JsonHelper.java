package filefactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.gson.Gson;

public class JsonHelper extends FileHelper  {
    private static final Gson GSON = new Gson();
    public void writeFile(Path path, String content) {
        try{
            Files.writeString(path, GSON.toJson(content));
        } catch (IOException e){
            System.out.println("Error - "+e);
        }

    }
    public String readFile(Path path) {
        try{
            String filecontent = Files.readString(path);
            return filecontent;
        } catch (IOException e) {
            System.out.println("Error - "+e);
            return null;
        }

        

    }
    
}
