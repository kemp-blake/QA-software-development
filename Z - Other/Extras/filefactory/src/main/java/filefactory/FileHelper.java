package filefactory;

import java.io.IOException;
import java.nio.file.Path;

public abstract class FileHelper {
    abstract String readFile(Path path) throws IOException;
    abstract void writeFile(Path path, String content) throws IOException;

    public String read(Path path) throws IOException{
        return readFile(path);

    }
    public void write(Path path, String content) throws IOException{
        writeFile(path, content);

    }
    
}
