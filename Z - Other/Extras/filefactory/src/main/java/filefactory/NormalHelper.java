package filefactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class NormalHelper extends FileHelper  {
    public void writeFile(Path path, String content) throws IOException {
        try{
            Files.writeString(path, content);
        } catch (IOException e){
            System.out.println("Error - "+e);
        }
        

    }
    public String readFile(Path path) throws IOException {
        try{
            String filecontent = Files.readString(path);
            return filecontent;
        } catch (IOException e) {
            System.out.println("Error - "+e);
            return null;
        }

    }
    
}