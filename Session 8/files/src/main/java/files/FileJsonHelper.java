package files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.gson.Gson;

public class FileJsonHelper {
    private static final Gson GSON = new Gson();

    private FileJsonHelper() {}
    
    public static String readText(Path path) throws IOException {
        return Files.readString(path);
    }

    public static void writeText(Path path, String text) throws IOException {
        Files.writeString(path, text);
    }

    public static <T> void writeJson(Path path, T obj) throws IOException {
        writeText(path, GSON.toJson(obj));

    }
    public static <T> T readJson(Path path, Class<T> type) throws IOException {
        return GSON.fromJson(readText(path), type);

    }
    
}
