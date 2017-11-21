package L15_Files_and_Streams_Lab;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class P06_Sort_Lines {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Stefan-PC\\Desktop\\New Folder (3)\\input.txt");
        Path output =Paths.get("C:\\Users\\Stefan-PC\\Desktop\\Stefko.txt");


        try {
            List<String> lines = Files.readAllLines(path);
            Collections.sort(lines);
            Files.write(output, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
