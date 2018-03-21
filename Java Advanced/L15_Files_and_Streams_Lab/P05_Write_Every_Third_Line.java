package L15_Files_and_Streams_Lab;

import java.io.*;

public class P05_Write_Every_Third_Line {
    public static void main(String[] args) {
        String path = "C:\\Users\\Stefan-PC\\Desktop\\New Folder (3)\\input.txt";
        String output = "C:\\Users\\Stefan-PC\\Desktop\\Stefko.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path));
             PrintWriter writer = new PrintWriter(output)) {

            String line = reader.readLine();
            int counter = 1;

            while (line != null) {
                if (counter % 3 == 0) {
                    writer.println(line);
                }

                line = reader.readLine();
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}