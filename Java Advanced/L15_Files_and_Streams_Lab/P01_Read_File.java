package L15_Files_and_Streams_Lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class P01_Read_File {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        String path = "C:\\Users\\Stefan-PC\\Desktop\\New Folder (3)\\input.txt";

        try (InputStream in = new FileInputStream(path)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.printf("%s ",Integer.toBinaryString(oneByte));
                oneByte = in.read();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
