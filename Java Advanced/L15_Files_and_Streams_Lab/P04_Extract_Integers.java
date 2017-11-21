package L15_Files_and_Streams_Lab;

import java.io.*;
import java.util.Scanner;

public class P04_Extract_Integers {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\Stefan-PC\\Desktop\\New Folder (3)\\input.txt";
        String output = "C:\\Users\\Stefan-PC\\Desktop\\Stefko.txt";

        try (Scanner scanner = new Scanner(new FileInputStream(path));
             PrintWriter writer = new PrintWriter(output)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    writer.println(scanner.nextInt());
                }

                scanner.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
}

