package L15_Files_and_Streams_Lab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class P07_List_Files {
    public static void main(String[] args) {
        String path = "C:\\Users\\Stefan-PC\\Desktop\\New Folder (3)\\Files-and-Streams";
        Path outputPath = Paths.get("C:\\Users\\Stefan-PC\\Desktop\\Stefko.txt");

        File file = new File(path);

        List<String> lines = new ArrayList<>();

        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (File f : files) {
                if (!f.isDirectory()) {
                    lines.add(String.format("%s: %s", f.getName(), f.length()));
                    System.out.printf("%s: %s%n", f.getName(), f.length());
                }
            }
        }
        try {
            Files.write(outputPath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}