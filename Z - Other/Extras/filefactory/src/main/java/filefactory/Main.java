package filefactory;

import java.io.IOException;
import java.nio.file.Path;


public class Main {
    public static void main(String[] args) throws IOException {
        FileHelper fileHelper = new NormalHelper();

        Path filepath = Path.of("Z - Other\\Extras\\filefactory\\src\\main\\resources\\reader.txt");

        System.out.println(fileHelper.read(filepath));

        FileHelper f2 = new JsonHelper();
        Path filepathjson = Path.of("Z - Other\\Extras\\filefactory\\src\\main\\resources\\object.json");

        System.out.println(f2.read(filepathjson));
    }
}