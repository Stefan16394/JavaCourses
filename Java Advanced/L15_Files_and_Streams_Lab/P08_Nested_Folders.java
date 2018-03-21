package L15_Files_and_Streams_Lab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P08_Nested_Folders {
    public static void main(String[] args) {

        String path = "C:\\Users\\Stefan-PC\\Desktop\\New Folder (3)\\Files-and-Streams";
        Path outputPath = Paths.get("C:\\Users\\Stefan-PC\\Desktop\\Stefko.txt");
        File file = new File(path);

        Deque<File> queue = new ArrayDeque<>();
        queue.offer(file);
        int count = 1;

        List<String> lines = new ArrayList<>();

        while (!queue.isEmpty()) {
            File currentDir = queue.poll();

            File[] nestedFiles = currentDir.listFiles();

            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()) {
                    queue.offer(nestedFile);
                    count++;
                }
            }
            System.out.println(currentDir.getName());
            lines.add(currentDir.getName());
        }
        System.out.println(count + " folders");
        lines.add(count + " folders");
        try {
            Files.write(outputPath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}